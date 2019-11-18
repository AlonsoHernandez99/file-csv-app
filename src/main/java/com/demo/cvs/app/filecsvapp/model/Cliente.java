package com.demo.cvs.app.filecsvapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private String documento;
    private  String nombre;
    private String correlativo;
}
