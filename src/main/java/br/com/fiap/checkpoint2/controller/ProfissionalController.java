package br.com.fiap.checkpoint2.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.checkpoint2.dto.dtoprofissional.ProfissinalResponse;
import br.com.fiap.checkpoint2.dto.dtoprofissional.ProfissionalRequestCreate;
import br.com.fiap.checkpoint2.dto.dtoprofissional.ProfissionalRequestUpdate;

@Service
@RequestMapping("/profissional")
public class ProfissionalController {

    @GetMapping("{id}")
    public ResponseEntity<ProfissinalResponse> findById (
        @RequestBody ProfissionalRequestCreate dto){
            return ResponseEntity.noContent().build();
        }



    @PostMapping
    public ResponseEntity<ProfissinalResponse> create(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }


    @GetMapping
    public ResponseEntity<List<ProfissinalResponse>> findAll(){
        return ResponseEntity.noContent().build();
    }

    // @PutMapping("{id}")
    // public ResponseEntity<ProfissinalResponse> update(@PathVariable Long id,
    //                                                   @RequestBody ProfissionalRequestUpdate dto){
          

    // }


}
