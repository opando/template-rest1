package com.opm.template.templaterest1.web.rest;

import com.opm.template.templaterest1.domain.Contribuyente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ContribuyenteRestController {

    @GetMapping("/contribuyentes/{numRuc}")
    public ResponseEntity<Contribuyente> findContribuyente(@PathVariable(value = "numRuc")String numRuc){

        Contribuyente c1 = new Contribuyente();
        c1.setNumRuc("20100128056");
        c1.setNombreRazonSocial("SAGA FALABELLA S.A.");
        c1.setTipoContribuyente("PERSONAS JURÍDICAS");
        return new ResponseEntity<Contribuyente>(c1, HttpStatus.OK);
    }
}
