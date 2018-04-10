package za.co.discovery.cucumber.framework.utility;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Utility class contain methods used in data parsing reading data from excel sheet and creating respective
 * objects
 *
 * @author Sudhir Mishra
 * @since August 2014
 */
public final class ExcelUtils {

    private static final String SPACE = " ";
    private static final char SEPARATOR = '|';
    private static final String ALL = "All";
    private static final String COLON_SEPARATOR = "; ";
    public static final String DATE_PATTERN = "ddMMyyyy";
    private static final char FILE_EXTENSION_CHAR = '.';
    private static final String FILE_EXTENSION_XLSX = "xlsx";
    private static final String FILE_EXTENSION_XLS = "xls";
    private static final Log LOG = LogFactory.getLog(ExcelUtils.class);
    private static final String TRUE = "true";
    private static final String FALSE = "false";

    /**
     * Splits the data on token and returns array of Strings, few cases (assuming pipeline "|" as a token:
     * |    should return array containing two blank string elements String[0]="", String[1]=""
     * A|   should return array containing two String[0]="A", String[1]="";
     * |A   should return array containing two String[0]="", String[1]="A";
     * A|B  should return array containing two String[0]="A", String[1]="B";
     * A||B  should return array containing three String[0]="A", String[1]="", String[3]="B";
     *
     * @param data Input data to split
     * @return array of strings if not null;
     */
    public static String[] split(final String data) {
        if (data == null) {
            return null;
        }

        //STEP 1: read the data character by character and appends SPACE character temporarily after / before token character if there is no character
        //and appends final data to string buffer
        final StringBuffer splitData = new StringBuffer();

        for (int index = 0; index < data.length(); index++) {

            final int nextIndex = index < (data.length() - 1) ? (index + 1)
                    : index;

            final char indexChar = data.charAt(index);
            final char nextIndexChar = data.charAt(nextIndex);

            if (indexChar == SEPARATOR && indexChar == nextIndexChar) {
                splitData.append(SEPARATOR + SPACE);
            } else {
                splitData.append(indexChar);
            }
        }

        //STEP 2
        //splits the buffered data using regular expression e.g. [|]
        final String[] data2Return = splitData.toString().split("[" + SEPARATOR + "]");

        //STEP 3
        //Trims the data before return, as we have added SPACE in STEP 1
        for (int index = 0; index < data2Return.length; index++) {
            data2Return[index] = data2Return[index].trim();
        }
        return data2Return;
    }

    /**
     * Converts data to List to Integers using split method.
     *
     * @param data Input data to split
     * @return returns Array of Integer Object
     */
    public static Integer[] integerSplit(final String data) {
        if (data == null) {
            return null;
        }
        final String[] splitString = split(data);

        final Integer[] data2Return = new Integer[splitString.length];
        for (int index = 0; index < data2Return.length; index++) {
            data2Return[index] = new Integer(((int) Double.parseDouble(splitString[index].trim())));
        }
        return data2Return;
    }


    public static String convert2Upper(String value) {
        return value.toUpperCase();
    }

    /**
     * Converts data to List of Long using split method.
     *
     * @param data Input data to split
     * @return returns Array of Long Object
     */
    public static Long[] longSplit(final String data) {
        if (data == null) {
            return null;
        }
        final String[] splitString = split(data);

        final Long[] data2Return = new Long[splitString.length];
        for (int index = 0; index < data2Return.length; index++) {
            data2Return[index] = new Long(((long) Double.parseDouble(splitString[index].trim())));
        }
        return data2Return;
    }

    /**
     * This method takes the string to be pushed in collection, parses it and adds to the collection
     *
     * @param collection where elements to be pushed
     * @param dataToPush data to be parsed and add
     * @return return Collection of String objects containing elements to be pushed
     */
    public static Collection<String> pushDataInCollection(final Collection<String> collection, final String dataToPush) {
        if (StringUtils.isNotBlank(dataToPush)) {
            collection.addAll(Arrays.asList(split(dataToPush)));
        }
        return collection;
    }

    /**
     * This method splits the data returns the collection of Integer
     *
     * @param data to split
     * @return Collection of Integer data
     */
    public static Collection<Integer> getIntegerCollection(final String data) {
        if (StringUtils.isNotBlank(data)) {
            return Arrays.asList(integerSplit(data));
        }
        return null;
    }

    /**
     * This method splits the data returns the collection of Long
     *
     * @param data to split
     * @return Collection of Long data
     */
    public static Collection<Long> getLongCollection(final String data) {
        if (StringUtils.isNotBlank(data)) {
            return Arrays.asList(longSplit(data));
        }
        return null;
    }

    /**
     * This method splits the data returns the collection of String
     *
     * @param data to split
     * @return Collection of String data
     */
    public static Collection<String> getStringCollection(final String data) {
        if (StringUtils.isNotBlank(data)) {
            return Arrays.asList(split(data));
        }
        return null;
    }

    /**
     * Splits the data on token and returns array of Strings, few cases (assuming pipeline "|" as a token:
     * |    should return array containing two blank string elements String[0]="", String[1]=""
     * A|   should return array containing two String[0]="A", String[1]="";
     * |A   should return array containing two String[0]="", String[1]="A";
     * A|B  should return array containing two String[0]="A", String[1]="B";
     * A||B  should return array containing three String[0]="A", String[1]="", String[3]="B";
     *
     * @param data      Input data to split
     * @param separator own defined separator instead of default
     * @return array of strings if not null;
     */
    public static String[] split(final String data, final char separator) {
        if (data == null) {
            return null;
        }

        //STEP 1: read the data character by character and appends SPACE character temporarily after / before token character if there is no character
        //and appends final data to string buffer
        final StringBuffer splitData = new StringBuffer();

        for (int index = 0; index < data.length(); index++) {

            final int nextIndex = index < (data.length() - 1) ? (index + 1)
                    : index;

            final char indexChar = data.charAt(index);
            final char nextIndexChar = data.charAt(nextIndex);

            if (indexChar == separator && indexChar == nextIndexChar) {
                splitData.append(separator + SPACE);
            } else {
                splitData.append(indexChar);
            }
        }

        //STEP 2
        //splits the buffered data using regular expression e.g. [|]
        final String[] data2Return = splitData.toString().split("[" + separator + "]");

        //STEP 3
        //Trims the data before return, as we have added SPACE in STEP 1
        for (int index = 0; index < data2Return.length; index++) {
            data2Return[index] = data2Return[index].trim();
        }
        return data2Return;
    }

    /**
     * Combines a String array of data into a single string using a separator
     *
     * @param data      Input data to combine
     * @param separator own defined separator instead of default
     * @return string if not null;
     */
    public static String combine(final String[] data, final char separator) {
        if (data == null) {
            return null;
        }
        return StringUtils.join(data, separator);
    }

    /**
     * Splits the input parameter into
     *
     * @param input Input data to split
     * @return array of strings if not null;
     */
    public static Collection<String> splitInputCriteria(String input) {
        Collection<String> output = new ArrayList<>();
        if (StringUtils.isNotBlank(input) && !input.equals(ALL)) {
            output = Arrays.asList(ExcelUtils.split(input));
        } else {
            output.add(ALL);
        }
        return output;
    }

    /**
     * Gets file name from a path name
     *
     * @param path Input path name
     * @return string file name;
     */
    public static String getFilenameFromPath(final String path) {

        if (StringUtils.isNotBlank(path)) {

            final String filename = FilenameUtils.getName(path);

            return (
                    filename.lastIndexOf(FILE_EXTENSION_CHAR) > 0
                            ?
                            filename.substring(0, (filename.lastIndexOf(FILE_EXTENSION_CHAR)))
                            :
                            filename
            );
        }
        return path;
    }

    /**
     * Gets file path from a full path name
     *
     * @param path Input path name
     * @return string file name;
     */
    public static String getPathFromFullPath(final String path) {
        if (StringUtils.isNotBlank(path)) {
            return FilenameUtils.getFullPath(path);
        }
        return path;
    }

    /**
     * Gets list of excel file names from path
     *
     * @param path Input path name
     * @return collection string file names;
     */
    public static Collection<String> getFilesFromPathXlxs(final String path) {
        return getFilesFromPath(path, FILE_EXTENSION_XLSX);
    }

    /**
     * Gets list of excel file names from path
     *
     * @param path Input path name
     * @return collection string file names;
     */
    public static Collection<String> getFilesFromPathXlxs(final String path, final int from, final int to) {
        Collection<String> files = getFilesFromPath(path, FILE_EXTENSION_XLSX);
        Collection<String> newFiles = new ArrayList<>();
        int count = 1;
        for (final String file : files) {
            if (count >= from && count <= to) {
                newFiles.add(file);
            }
        }
        return getFilesFromPath(path, FILE_EXTENSION_XLSX);
    }

    /**
     * Gets list of excel file names from path
     *
     * @param path Input path name
     * @return collection string file names;
     */
    public static Collection<String> getFilesFromPath(final String path, final String type) {
        if (StringUtils.isNotBlank(path)) {
            Collection<String> fileNames = new ArrayList<>();
            try {
                List<File> files = (List<File>) FileUtils.listFiles(new File(path), new String[] { type }, false);
                if (files.size() == 0) {
                    files = (List<File>) FileUtils.listFiles(new File(path), new String[] { type }, false);
                }
                for (File file : files) {
                    if (type.equals(FILE_EXTENSION_XLSX)) {
                        if (isValidExcelFile(file.getCanonicalPath())) {
                            fileNames.add(file.getCanonicalPath());
                        }
                    } else {
                        fileNames.add(file.getCanonicalPath());
                    }
                }
            } catch (final IOException e) {
                if (LOG.isErrorEnabled()) {
                    LOG.error(e);
                    e.printStackTrace();
                }
            }
            return fileNames;
        } else {
            return null;
        }
    }

    /**
     * Determines whether the filename is a valid Excel file
     *
     * @param filename
     * @return boolean valid file name
     */
    public static boolean isValidExcelFile (final String filename) {
        boolean valid = true;
        if (filename.contains("~$")) {
            valid = false;
        }
        if (!(filename.contains(".xlsx") || filename.contains(".xls"))) {
            valid = false;
        }
        return valid;
    }

    /**
     * Gets list of excel file names from path
     *
     * @param startPath source path name
     * @param containing string to find in file name
     * @param movePath string to find in file name
     * @return collection string file names;
     */
    public static boolean moveFilesWithNameFilter(final String startPath, final String containing, final String movePath) {
        if (StringUtils.isNotBlank(containing) && StringUtils.isNotBlank(movePath)) {
            try {
                List<File> files = (List<File>) FileUtils.listFiles(new File(startPath), new WildcardFileFilter("*" + containing + "*"), FalseFileFilter.FALSE);
                for (File file : files) {
                    FileUtils.moveFileToDirectory(file, new File(movePath), false);
                }
                return true;
            } catch (final IOException e) {
                if (LOG.isErrorEnabled()) {
                    LOG.error(e);
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * Gets list of excel file names from path
     *
     * @param startPath source path name
     * @param movePath string to find in file name
     * @return collection string file names;
     */
    public static boolean moveAllFilesToAnotherDirectory(final String startPath, final String movePath) {
        if (StringUtils.isNotBlank(startPath) && StringUtils.isNotBlank(movePath)) {
            try {
                List<File> files = (List<File>) FileUtils.listFiles(new File(startPath), new WildcardFileFilter("*.xlsx"), FalseFileFilter.FALSE);
                for (File file : files) {
                    FileUtils.moveFileToDirectory(file, new File(movePath), false);
                }
                return true;
            } catch (final IOException e) {
                if (LOG.isErrorEnabled()) {
                    LOG.error(e);
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * Gets list of excel file names from path with a specific filtered value
     *
     * @param startPath source path name
     * @param containing string to find in file name
     * @return collection string file names;
     */
    public static Collection<String> getFilesWithNameFilter(final String startPath, final String containing) {
        if (StringUtils.isNotBlank(containing)) {
            try {
                Collection<String> foundFiles = new ArrayList<>();
                List<File> files = (List<File>) FileUtils.listFiles(new File(startPath), new WildcardFileFilter("* ID " + containing + " *"), FalseFileFilter.FALSE);
                for (File file : files) {
                    foundFiles.add(file.getAbsolutePath());
                }
                return foundFiles;
            } catch (final Exception e) {
                if (LOG.isErrorEnabled()) {
                    LOG.error(e);
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * Gets the latest file from a directory with a filtered criteria
     *
     * @param startPath source path name
     * @param containing string to find in file name
     * @return collection string file names;
     */
    public static String getLatestFileWithNameFilter(final String startPath, final String containing) {
        if (StringUtils.isNotBlank(containing)) {
            try {
                String foundFile = null;
                File latestFile = null;
                File previousFile = null;
                File nextFile;
                List<File> files = (List<File>) FileUtils.listFiles(new File(startPath), new WildcardFileFilter("*" + containing + "*"), FalseFileFilter.FALSE);
                files = removeInvalidFilesFromList(files);
                for (File file : files) {
                    nextFile = file;
                    if (previousFile == null) {
                        latestFile = file;
                    } else if (nextFile.lastModified() > previousFile.lastModified()) {
                        if (nextFile.lastModified() > latestFile.lastModified()) {
                            latestFile = file;
                        }
                    }
                    previousFile = nextFile;
                }
                if (latestFile != null) {
                    foundFile = latestFile.getAbsolutePath();
                }
                return foundFile;
            } catch (final Exception e) {
                if (LOG.isErrorEnabled()) {
                    LOG.error(e);
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return null;
    }

    public static List<File> removeInvalidFilesFromList(List<File> inFiles) {
        List<File> outFiles = new ArrayList<>();
        for (File file : inFiles) {
            if (!file.getName().contains("~$")) {
                outFiles.add(file);
            }
        }
        return outFiles;
    }

    /**
     * Builds a concatenated string with multiple results
     *
     * @param input string
     * @return string file name;
     */
    public static String buildResultString(String input, String result) {
        return (
                StringUtils.isNotBlank(input)
                        ?
                        StringUtils.join(new String[]{String.valueOf(input), String.valueOf(result)}, COLON_SEPARATOR)
                        :
                        StringUtils.join(new String[]{String.valueOf(input), String.valueOf(result)})
        );
    }

    /**
     * gets a list of rows from a specified file from a specific row index
     *
     * @param filename string
     * @param index string
     * @return string file name;
     */
    public static Collection<Row> getRowsInFileFromIndex (String filename, int index) throws IOException {
        return (new XLSXReader(filename, index)).getRows(index);
    }

    /**
     * This function checks if a directory exists and creates it if it doesn't
     * @param destination
     * @return
     */
    public static boolean checkIfDirectoryExists (String destination) {
        boolean result = new File(destination).mkdirs();
        return result;
    }

    /**
     * This function returns a Boolean value from a String representation
     * @param inString
     * @return
     */
    public static Boolean getBooleanFromString (final String inString) {
        Boolean result = null;
        if (inString != null) {
            if (inString.toLowerCase().equals(TRUE)) {
                result = true;
            } else if (inString.toLowerCase().equals(FALSE)) {
                result = false;
            }
        }
        return result;
    }
}
