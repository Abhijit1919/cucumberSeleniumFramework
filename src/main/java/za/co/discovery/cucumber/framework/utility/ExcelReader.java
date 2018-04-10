package za.co.discovery.cucumber.framework.utility;


import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The XLS file reader object. This class allows you to read from a .xls file.
 *
 * @author Sudhir Mishra
 * @author Justin Rundle
 * @since July 2014
 */
public class ExcelReader {

    private static final Log LOG = LogFactory.getLog(ExcelReader.class);

    public static final String DATE_PATTERN = "ddMMyyyy";
    private Workbook workbook;

    private Sheet sheet;
    //private XSSFWorkbook workbook;
    //private XSSFSheet sheet;

    /**
     * Default constructor to instantiate an new reader to read from an .xls file.
     *
     * @param pathName A pathName string
     * @throws IOException If something goes wrong when reading from file.
     */
    public ExcelReader(final String pathName) throws IOException {
        loadWorkbook(pathName);
    }

    /**
     * Default constructor to instantiate an new reader to read from an .xls file.
     *
     * @param pathName   A pathName string
     * @param sheetIndex A index of the sheet in the workbook.
     * @throws NullPointerException If the <code>pathname</code> argument is <code>null</code>
     * @throws IOException  If something goes wrong when reading from file.
     */
    public ExcelReader(final String pathName, final int sheetIndex) throws NullPointerException, IOException {
        loadWorkbook(pathName);
        loadSheet(sheetIndex);
    }

    /**
     * Default constructor to instantiate an new reader to read from an .xls file.
     *
     * @param path      Path entry for the file
     * @param sheetName A name of the sheet in the workbook.
     * @throws NullPointerException If the <code>pathname</code> argument is <code>null</code>
     * @throws IOException  If something goes wrong when reading from file.
     */
    public ExcelReader(final Path path, final String sheetName) throws NullPointerException, IOException {
        loadWorkbook(path.toFile().getAbsolutePath());
        loadSheet(sheetName);
    }

    /**
     * Default constructor to instantiate an new reader to read from an .xls file.
     *
     * @param pathName  A pathName string
     * @param sheetName A name of the sheet in the workbook.
     * @throws NullPointerException If the <code>pathName</code> or <code>sheetName</code> argument is <code>null</code>
     * @throws IOException  If something goes wrong when reading from file.
     */
    public ExcelReader(final String pathName, final String sheetName) throws NullPointerException, IOException {
        loadWorkbook(pathName);
        loadSheet(sheetName);
    }

    protected void loadWorkbook(final String pathName) throws IOException {
        if (LOG.isTraceEnabled()) {
            LOG.trace(String.format("pathName=%s", pathName));
        }
        Assert.assertNotNull(pathName);


        InputStream in = null;
        try {
            in = getInputStream(pathName);
//            workbook = new XSSFWorkbook(in);
            //changed this to be able to read xls and xlsx
            String suffix = FilenameUtils.getExtension(pathName);
            if (suffix.equalsIgnoreCase("xls")) {
                workbook = new HSSFWorkbook(new POIFSFileSystem(in));
            } else if (suffix.equalsIgnoreCase("xlsx")) {
                workbook = new XSSFWorkbook(in);
            }

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (final IOException e) {
                    if (LOG.isWarnEnabled()) {
                        LOG.warn(e.getMessage(), e);
                    }
                    throw e;
                }
            }
        }
    }

    /**
     * Loads given sheet from workbook
     *
     * @param sheetName Name of the sheet to load
     * @throws IllegalArgumentException when the sheet does not exist
     */
    public void loadSheet(final String sheetName) {
        Assert.assertNotNull(workbook);
        sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            if (LOG.isErrorEnabled()) {
                LOG.error(String.format("Sheet %s does not exist", sheetName));
            }
            throw new IllegalArgumentException(String.format("Sheet %s does not exist", sheetName));
        }
    }

    /**
     * Loads given sheet from workbook
     * @param sheetIndex Index of the sheet to load
     * @throws IllegalArgumentException when the sheet does not exist
     */
    public void loadSheet(final int sheetIndex) {
        Assert.assertNotNull(workbook);
        sheet = workbook.getSheetAt(sheetIndex);
        if (sheet == null) {
            if (LOG.isErrorEnabled()) {
                LOG.error(String.format("Sheet Index: %s does not exist", sheetIndex));
            }
            throw new IllegalArgumentException(String.format("Sheet Index: %s does not exist", sheetIndex));
        }
    }

    /**
     * Determine whether or not a sheet is in the workbook
     *
     * @param sheetName Name of the sheet being sought
     * @return  True if the sheet exists, else False
     */
    public boolean sheetExists(final String sheetName) {
        Assert.assertNotNull(workbook);
        sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            return false;
        } else {
            return true;
        }
    }

    private InputStream getInputStream(final String pathName) throws FileNotFoundException {
        Assert.assertNotNull(pathName);

        final InputStream in;
        if (pathName.startsWith("classpath:")) {
            // Remove the "classpath:" from the path.
            final String name = pathName.substring(pathName.indexOf(':') + 1);

            final ClassLoader loader = Thread.currentThread().getContextClassLoader();
            final URL url = loader.getResource(name);

//            in = new FileInputStream(new File(url.getPath()));
            in = loader.getResourceAsStream(name);


        } else {


            //in = new FileInputStream(new File(pathName));


            in = getClass().getResourceAsStream(pathName);
        }
        return in;
    }


    /**
     * Read a single row given the row index.
     *
     * @param rowIndex The row index.
     * @return The excel row object.
     */
    public final Row getRow(final int rowIndex) {
        if (LOG.isTraceEnabled()) {
            LOG.trace(String.format("--- getRow(%s) ----", rowIndex));
        }
        return sheet.getRow(rowIndex);
    }

    /**
     * Read a list of rows given the row from index.
     *
     * @param rowFromIndex The row index.
     * @return The excel rows list.
     */
    public final List<Row> getRows(final int rowFromIndex) {
        List<Row> rows = new ArrayList<>();
        for (int rowIndex = rowFromIndex + 1; ; rowIndex++) {
            final Row row = sheet.getRow(rowIndex);
            // Check if we have hit the EOF.
            if (row == null) {
                break;
            }
            rows.add(row);
        }
        return rows;
    }

    /**
     * Returns the row index of the last row.
     *
     * @return The last row index.
     */
    public final int getLastRowIndex() {
        return sheet.getLastRowNum();
    }

    public void evaluateAll() {
        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
        evaluator.evaluateAll();
    }

    public void evaluateCell(final int rowIndex, final int columnIndex) {
        Cell cell = sheet.getRow(rowIndex).getCell(columnIndex);
        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
        if (cell!=null) {
            switch (evaluator.evaluateFormulaCell(cell)) {
                case Cell.CELL_TYPE_BOOLEAN:
                    System.out.println(cell.getBooleanCellValue());
                    break;
                case Cell.CELL_TYPE_NUMERIC:
                    System.out.println(cell.getNumericCellValue());
                    break;
                case Cell.CELL_TYPE_STRING:
                    System.out.println(cell.getStringCellValue());
                    break;
                case Cell.CELL_TYPE_BLANK:
                    break;
                case Cell.CELL_TYPE_ERROR:
                     System.out.println(cell.getErrorCellValue());
                    break;

                // CELL_TYPE_FORMULA will never occur
                case Cell.CELL_TYPE_FORMULA:
                    break;
            }
        }
    }

    /**
     * Method to convert a Cell object to a string representation.
     *
     * @param cell The cell object to evaluate.
     * @return The string value.
     */
    public static String getStringCellValue(final Cell cell) {
        //for Blank columns cell is null, it should not stop parsing, must return blank value
        if (cell == null) {
            return null;
        }

        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_BLANK:
                return null;

            case Cell.CELL_TYPE_BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());

            case Cell.CELL_TYPE_FORMULA:
                switch (cell.getCachedFormulaResultType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        return String.valueOf(cell.getNumericCellValue());

                    case Cell.CELL_TYPE_STRING:
                        return cell.getRichStringCellValue().getString();
                }
            case Cell.CELL_TYPE_NUMERIC:
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    final Date date = HSSFDateUtil.getJavaDate(cell.getNumericCellValue());
                    return new SimpleDateFormat(ExcelUtils.DATE_PATTERN).format(date);
                }
                String cellValue = String.valueOf(cell.getNumericCellValue());
                if (cellValue != null && cellValue.endsWith(".0")) {
                    cellValue = cellValue.substring(0, cellValue.length() - 2);
                }
                if (cellValue != null && cellValue.contains("E")) {
                    try {
                        cellValue = cell.getStringCellValue();
                    } catch (IllegalStateException es) {
                        if (LOG.isDebugEnabled()) {
                            LOG.debug(es);
                        }
                        cellValue = String.valueOf(((XSSFCell) cell).getRawValue());
                    }
                }
                return cellValue;
            case Cell.CELL_TYPE_STRING:
                return cell.getStringCellValue();
            default:
                if (LOG.isErrorEnabled()) {
                    LOG.error("Cell type %s not supported." + cell.getCellType());
                }
                throw new IllegalArgumentException(String.format("Cell type %s not supported.", cell.getCellType()));
        }
    }

    /**
     * Get the values in a column as a list
     *
     * @param columnIndex   Index position of the column of values
     * @return  List of values in the column
     */
    public List<String> getColumnValues(final int columnIndex) {
        List<String> valuesInColumn = new ArrayList<>();
        List<Row> rows = getRows(0);
        for (Row row : rows) {
            valuesInColumn.add(getStringCellValue(row.getCell(columnIndex)));
        }
        return valuesInColumn;
    }

    /**
     * Get the number of sheets in a file
     * @return  Count of the sheets
     */
    public int getNumberSheetsInFile() {
        return workbook.getNumberOfSheets();
    }

    /**
     * Get the sheet name from an index
     *
     * @param index Index of the sheet
     * @return  Name of the sheet
     */
    public String getSheetNameAtIndex(final int index) {
        return workbook.getSheetName(index);
    }

    /**
     * Get the index of a sheet using its name
     *
     * @param sheetName Name of the sheet
     * @return  Index of the sheet
     */
    public int getIndexOfSheetName(final String sheetName) {
        return workbook.getSheetIndex(sheetName);
    }
}
