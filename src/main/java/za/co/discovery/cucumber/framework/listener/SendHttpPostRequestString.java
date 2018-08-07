package za.co.discovery.cucumber.framework.listener;

import org.apache.log4j.Logger;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by JACO11 on 21-Jul-17.
 */
public class SendHttpPostRequestString {

    private static final Logger LOG = Logger.getLogger(SendHttpPostRequestString.class);
    /**
     * Send a JSON request in order to retrieve a active sessionId
     * @param data the JSOn request that need to be submitted
     * @param jURL The actual web service address used to send the request
     * @return return the sessionId
     * @throws IOException throw an exception when a error have occurred
     *
     */

    public String postHttpRequestSessionId(String data, String jURL) throws IOException {

        HttpURLConnection httpCon;

        String js = String.valueOf(data);

        try {

            URL url = new  URL(jURL); //URL to the JSON REST service
            httpCon = (HttpURLConnection) url.openConnection();
            httpCon.setDoOutput(true);
            httpCon.setRequestMethod("POST");
            httpCon.setRequestProperty("Content-Type","text/xml");

            httpCon.setRequestProperty("Content-Length",
                    Integer.toString(js.getBytes().length));
            httpCon.setRequestProperty("Content-Language", "en-US");

            httpCon.setUseCaches(false);
            httpCon.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream(httpCon.getOutputStream());
            wr.writeBytes(js);
            wr.close();

            // Get Response
            InputStream is = httpCon.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }

            rd.close();
            httpCon.disconnect();

            return response.toString();

        } catch (Exception e) {
            //results.setTEST_STEP_DESCRIPTION("(Error) SendHttpPostRequestString.postHttpRequestSessionId - Following error occurred while retrieving SessionID  [" + e.getMessage() + "]");
            LOG.error("Following error occurred while retrieving SessionID  [" + e.getMessage() + "]");
            return null;
        }

    }
}
