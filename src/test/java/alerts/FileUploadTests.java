package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();

        uploadPage.uploadFile("C:\\Users\\11075\\IdeaProjects\\webdriver-java\\resources2\\chromedriver.exe");

        String uploadedFileName = uploadPage.getUploadedFiles();
        assertTrue(uploadedFileName.contains("chromedriver.exe"),
                "Uploaded file name is not correct. Found: " + uploadedFileName);
    }
}