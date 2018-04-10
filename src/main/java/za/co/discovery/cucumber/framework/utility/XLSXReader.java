package za.co.discovery.cucumber.framework.utility;

import java.io.IOException;

/**
 * The XLS file reader object. This class allows you to read from a .xls file.
 *
 * @author Justin Rundle
 * @author Sudhir Mishra
 * @since August 2014
 */
public class XLSXReader extends ExcelReader {

    /**
     * Default constructor to instantiate an new reader to read from an .xls file.
     *
     * @param pathName   A pathName string
     * @param sheetIndex A index of the sheet in the workbook.
     * @throws NullPointerException If the <code>pathname</code> argument is <code>null</code>
     * @throws IOException          If something goes wrong when reading from file.
     */
    public XLSXReader(final String pathName, final int sheetIndex) throws NullPointerException, IOException {
        super(pathName, sheetIndex);
    }


    /**
     * Default constructor to instantiate an new reader to read from an .xls file.
     *
     * @param pathName  A pathName string
     * @param sheetName A name of the sheet in the workbook.
     * @throws NullPointerException If the <code>pathName</code> or <code>sheetName</code> argument is <code>null</code>
     * @throws IOException          If something goes wrong when reading from file.
     */
    public XLSXReader(final String pathName, final String sheetName) throws NullPointerException, IOException {
        super(pathName, sheetName);
    }

    /**
     * Default constructor to initialize workbook
     *
     * @param pathName location of spreadsheet
     * @throws IOException If something goes wrong when reading from file.
     */
    public XLSXReader(final String pathName) throws IOException {
        super(pathName);
    }
}
