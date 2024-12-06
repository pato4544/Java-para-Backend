package com.app.demo.services;


import com.app.demo.entities.Cancion;

import com.app.demo.repositories.CancionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class CancionService {

    @Autowired
    private CancionRepository cancionRepository;

    public void crear (Cancion cancion){
        cancionRepository.save(cancion);
    }

    public boolean editar(Long id, Cancion cancionNueva) {
        Cancion cancionActualizada = null;
        Optional<Cancion> optCancionVieja = cancionRepository.findById(id);
        if (optCancionVieja.isPresent()) {
            cancionActualizada = optCancionVieja.get();
            cancionActualizada.setNombre(cancionNueva.getBanda());
            cancionActualizada.setBanda(cancionNueva.getBanda());
            return true;
        }
    return false;
    }

    public ArrayList<Cancion> mostrar() {
        ArrayList<Cancion> canciones = (ArrayList<Cancion>) cancionRepository.findAll();
        return canciones;
    }
    public void eliminar(Long id){
        cancionRepository.deleteById(id);
    }
}
