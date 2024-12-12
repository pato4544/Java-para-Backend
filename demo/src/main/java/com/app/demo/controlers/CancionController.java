package com.app.demo.controlers;

import com.app.demo.entities.Cancion;
import com.app.demo.services.CancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/canciones") //localhost:8080/canciones
public class CancionController {

    @Autowired
    private CancionService cancionService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearCancion(@RequestBody Cancion cancion){
        cancionService.crear(cancion);
        return ResponseEntity.ok("Se creo la cancion en perfectas condiciones");
    }

    @GetMapping("/mostrar")
    public ResponseEntity<?> mostrarCanciones(){
        ArrayList<Cancion> canciones = cancionService.mostrar();
        return ResponseEntity.ok(canciones);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizarCancion(@PathVariable Long id, @RequestBody Cancion cancion){
        boolean actualizado = cancionService.editar(id, cancion);
        if (actualizado){
            return ResponseEntity.ok("La cancion se edito en perfectas condiciones");
        } else {
            return ResponseEntity.ok("No se pudo hacer capo");
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarCancion(@PathVariable Long id) {
        cancionService.eliminar(id);
        return ResponseEntity.ok("Se elimino en perfectas condiciones");
    }
}