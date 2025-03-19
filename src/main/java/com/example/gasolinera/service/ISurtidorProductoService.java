package com.example.gasolinera.service;

import com.example.gasolinera.model.Producto;
import com.example.gasolinera.model.Surtidor;
import com.example.gasolinera.model.SurtidorProducto;
import java.util.List;

public interface ISurtidorProductoService {
    
    // método para traer todos los surtidorProductos
    // lectura
    public List<SurtidorProducto> getSurtidorProductos();

    // alta
    public void saveSurtidorProducto(SurtidorProducto surtidorProducto);

    // baja
    public void deleteSurtidorProducto(Long idSurtidorProducto);

    // lectura de un solo objeto
    public SurtidorProducto findSurtidorProducto(Long idSurtidorProducto);

    // edición/modificación
    public void editSurtidorProducto(Long idOriginal, 
                                    Surtidor nuevoSurtidor,
                                    Producto nuevoProducto);
}

