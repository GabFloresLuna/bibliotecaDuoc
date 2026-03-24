package com.example.bibliotecaDuoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bibliotecaDuoc.repository.LibroRepository;
import com.example.bibliotecaDuoc.model.Libro;
import java.util.List;

@Service
public class LibroService 
{
    @Autowired
    private LibroRepository libroRepository = new LibroRepository();

    public List<Libro> getLibros() 
    {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro)
    {
        return libroRepository.guardar(libro);
    }

    public Libro getLibroID(int id) 
    {
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro)
    {
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id) 
    {
        libroRepository.eliminar(id);
        return "producto eliminado";
    }

    public int totalLibrosV2()
    {
        return libroRepository.totalLibros();
    }

    public Libro getLibroIsbn(String isbn)
    {
        return libroRepository.buscarPorIsbn(isbn);
    }

    public List<Libro> getLibrosano(int ano)
    {
        return libroRepository.buscarLibroAno(ano);
    }

    public List<Libro> getLibroAutor(String autor)
    {
        return libroRepository.buscarLibroAutor(autor);
    }

    public List<Libro> getLibrosAntiguos()
    {
        return libroRepository.buscarLibroAntiguo();
    }

    public List<Libro> getLibrosRecientes()
    {
        return libroRepository.buscarLibroReciente();
    }

    public List<Libro> getLibrosCronologico()
    {
        return libroRepository.ordenCronologico();
    }
}
