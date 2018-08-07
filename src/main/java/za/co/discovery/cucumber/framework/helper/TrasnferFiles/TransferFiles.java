package za.co.discovery.cucumber.framework.helper.TrasnferFiles;


//import org.json.JSONArray;
//import org.json.JSONException;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TransferFiles {

    public void transferFiles(String filePath, String fileName, String fileType) {

        try {

            byte[] finalFile = readBytesFromFile(filePath);

            String message;
            JSONObject json = new JSONObject();
            json.put("fileDetails", finalFile);
            json.put("name", fileName);
            json.put("ext", fileType);

            message = json.toString();

            URL url = new URL("http://dhtqtp01:8085/sendFileBytes/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            OutputStream os = conn.getOutputStream();
            os.write(message.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                System.out.println("Failed : HTTP error code : "+conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {
            System.out.println("Somthing went wrong");
            //e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Somthing went wrong");
          //  e.printStackTrace();
            System.out.println("Somthing went wrong"+e.getMessage());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public byte[] readBytesFromFile(String filePath) {

        System.out.println("Start to convert file { }"+ filePath);
        FileInputStream fileInputStream = null;
        byte[] bytesArray = null;

        try {

            File file = new File(filePath);
            bytesArray = new byte[(int) file.length()];

            //read file into bytes[]
            fileInputStream = new FileInputStream(file);

            System.out.println("Start converting file to byte[] ");
            fileInputStream.read(bytesArray);
            System.out.println("File converted and returned as byte[]");
            return bytesArray;
        } catch (FileNotFoundException e) {
            System.out.println("The specified file have not been found on the local machine");
            return null;
        } catch (IOException e1) {
            System.out.println("There have been an error reading the file. Error {}" + e1.getMessage());
            return null;
        }

    }


}

