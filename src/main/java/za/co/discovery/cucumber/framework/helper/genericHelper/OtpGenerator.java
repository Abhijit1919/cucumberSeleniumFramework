package za.co.discovery.cucumber.framework.helper.genericHelper;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class OtpGenerator {

    public String otpURL(String entity)throws FailingHttpStatusCodeException,IOException {
        String myURL =  "https://testc2b.discovery.co.za/wsg/api/otp-lookup/"+entity;

        System.out.println("Requeted URL:" + myURL);
        StringBuilder sb = new StringBuilder();
        URLConnection urlConn = null;
        InputStreamReader in = null;
        try {
            URL url = new URL(myURL);
            urlConn = url.openConnection();
            if (urlConn != null)
                urlConn.setReadTimeout(60 * 1000);
            if (urlConn != null && urlConn.getInputStream() != null) {
                in = new InputStreamReader(urlConn.getInputStream(),
                        Charset.defaultCharset());
                BufferedReader bufferedReader = new BufferedReader(in);
                if (bufferedReader != null) {
                    int cp;
                    while ((cp = bufferedReader.read()) != -1) {
                        sb.append((char) cp);
                    }
                    bufferedReader.close();
                }
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException("Exception while calling URL:"+ myURL, e);
        }
        String[] arrOTP = sb.toString().split(",");
        String splitGeneratorOTP ="";
        splitGeneratorOTP = arrOTP[3].split(":")[1];
        String sptOTP = splitGeneratorOTP.replaceAll("\"","");
        System.out.println(sptOTP);



        return sptOTP;
    }
}
