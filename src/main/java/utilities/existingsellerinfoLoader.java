package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class existingsellerinfoLoader {
	private Properties properties;
	
	public existingsellerinfoLoader() {
		properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/main/resources/existingsellerinfo.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
//	public String getStoreName() {
//        return properties.getProperty("StoreName");
//    }

    public String getEmailId() {
        return properties.getProperty("Emailid");
    }

//    public String getMobileNumber() {
//        return properties.getProperty("MobileNumber");
//    }

    public String getPassword() {
        return properties.getProperty("Password");
    }

//    public String getAddress() {
//        return properties.getProperty("Address");
//    }
//    public String getOTP() {
//        return properties.getProperty("OTP");
//    }

}