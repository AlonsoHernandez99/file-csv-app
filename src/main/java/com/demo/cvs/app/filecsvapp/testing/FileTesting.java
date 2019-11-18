package com.demo.cvs.app.filecsvapp.testing;

import com.demo.cvs.app.filecsvapp.services.FileProcesingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FileTesting {

    @Autowired
    private FileProcesingService fileProcesingService;

    @Test
    public void testFile() throws IOException {
        //fileProcesingService.procesFile();
    }
}
