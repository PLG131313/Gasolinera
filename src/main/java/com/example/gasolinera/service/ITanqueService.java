package com.example.gasolinera.service;

import com.example.gasolinera.model.Producto;
import com.example.gasolinera.model.Tanque;
import java.util.List;

public interface ITanqueService {
    
    // método para traer todos los tanques
    // lectura
    public List<Tanque> getTanques();

    // alta
    public void saveTanque(Tanque tanque);

    // baja
    public void deleteTanque(Long idTanque);

    // lectura de un solo objeto
    public Tanque findTanque(Long idTanque);

    // edición/modificación
    public void editTanque(Long idOriginal, 
                          String nuevoCodigo,
                          Integer nuevaCapacidadMaxima,
                          Integer nuevoNivelActual,
                          Producto nuevoProducto);
}

