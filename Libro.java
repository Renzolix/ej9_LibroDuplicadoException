public class Libro {
    private String titulo;
    private String isbn;
    private int ejemplaresDisponibles;

    public Libro(String titulo, String isbn, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public String getTitulo() { 
        return titulo; 
    }
    
    public String getIsbn() { 
        return isbn; 
    }
    
    public int getEjemplaresDisponibles() { 
        return ejemplaresDisponibles; 
    }
}