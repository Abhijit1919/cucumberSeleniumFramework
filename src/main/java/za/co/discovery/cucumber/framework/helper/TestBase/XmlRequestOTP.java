package za.co.discovery.cucumber.framework.helper.TestBase;

import za.co.discovery.cucumber.framework.listener.SendHttpPostRequestString;

public class XmlRequestOTP {

    public String xmlForOTP(String userEntity) throws Exception {
        String xmlURL = "http://dhtapssrv.discsrv.co.za:7003/otp/spring-ws/otp";

//        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
//                "          <por:GenerateOTPRequestMessage schemaVersion=\"1.0\">\n" +
//                "         <por:authority>OTP_SECOND_LEVEL_AUTH</por:authority>\n" +
//                "         <por:entity>"+userEntity+"</por:entity>\n" +
//                "         <!--Optional:-->\n" +
//                "         <por:webSessionId>?</por:webSessionId>\n" +
//                "         <!--Optional:-->\n" +
//                "         <por:MinPinLength>?</por:MinPinLength>\n" +
//                "      </por:GenerateOTPRequestMessage>\n";

        String xml =
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:por=\"http://schemas.discovery.co.za/portal\">\n" +
                        "   <soapenv:Header/>\n" +
                        "   <soapenv:Body>\n" +
                        "      <por:GenerateOTPRequestMessage schemaVersion=\"1.0\">\n" +
                        "         <por:authority>OTP_SECOND_LEVEL_AUTH</por:authority>\n" +
                        "         <por:entity>" + userEntity + "</por:entity>\n" +
                        "<por:webSessionId>"+6+"</por:webSessionId>\n" +
                        "      </por:GenerateOTPRequestMessage>\n" +
                        "   </soapenv:Body>\n" +
                        "</soapenv:Envelope>";


        SendHttpPostRequestString sendHttpPostRequestString = new SendHttpPostRequestString();
        String otpXml = sendHttpPostRequestString.postHttpRequestSessionId(xml, xmlURL);
        System.out.println(otpXml);
        String[] splitOtpXml = otpXml.split(">");

        String splitOtpNumber = "";

        splitOtpNumber = splitOtpXml[5].split("<")[0];

        //  System.out.println("");

        System.out.println(splitOtpNumber);
        return splitOtpNumber;
    }

}
