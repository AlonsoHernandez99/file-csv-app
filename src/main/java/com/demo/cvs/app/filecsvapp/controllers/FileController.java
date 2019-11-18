package com.demo.cvs.app.filecsvapp.controllers;

import com.demo.cvs.app.filecsvapp.services.FileProcesingService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("files/")
@Log4j2
public class FileController {

    @Autowired
    private FileProcesingService fileProcesingService;

    @GetMapping("/validate/csv")
    public void reciveFile(@RequestParam("csv") MultipartFile file) throws IOException {
       log.info("==== RUN METHOD OF CONTROLLER ====");
       log.info("FILE: " + file.getOriginalFilename());
       fileProcesingService.procesFile(file);
    }
}
