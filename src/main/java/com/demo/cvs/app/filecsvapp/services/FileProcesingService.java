package com.demo.cvs.app.filecsvapp.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Service
@Log4j2
public class FileProcesingService {

    private static final String URL_FILE = "files/file.csv";
    private static  final String rulesMatches = ".*[éèàùñÑ�;!#$%&/()?¡¨*].*";

    public void procesFile(MultipartFile file) throws IOException {

            String line;
            InputStream is = file.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            int lineNumber = 1;
            if(br.readLine() == null){
                log.info("ARCHIVO VACIO");
            }else{
                while ((line = br.readLine()) != null) {
                    /*if(lineNumber == 0) {
                        lineNumber++;
                        continue;
                    }
                    lineNumber++;*/

                    log.info("LINE: " + line,"UTF-8");
                    if(!line.contains(",")){
                        log.info("NO CONTIENE COMA LA LINEA: " + lineNumber);
                    }
                    if(line.equals("")){
                        log.info("LINEA EN BLANCO EN LA : " + lineNumber);
                    }
                    if(line.matches(rulesMatches)){
                        log.info("CONTIENE CARACTERES DIFERENTES EN LA LINEA: " +lineNumber);
                    }
                    lineNumber++;
                }
            }
        }

}
