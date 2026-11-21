import java.util.ArrayList;

public class CatalogoBibliotecaDuplicados {
    private ArrayList<Libro> listaLibros = new ArrayList<>();

    // Método que revisa si el ISBN ya existe antes de agregarlo
    public void agregarLibro(Libro nuevoLibro) {
        for (Libro l : listaLibros) {
            if (l.getIsbn().equalsIgnoreCase(nuevoLibro.getIsbn())) {
                // Si encuentra el mismo ISBN, interrumpe el programa lanzando la excepción
                throw new LibroDuplicadoException(
                    "No se puede agregar el libro '" + nuevoLibro.getTitulo() + 
                    "'. El ISBN " + nuevoLibro.getIsbn() + " ya existe en el catálogo."
                );
            }
        }
        // Si no está duplicado, lo agrega a la lista
        listaLibros.add(nuevoLibro);
        System.out.println("Libro '" + nuevoLibro.getTitulo() + "' agregado correctamente.");
    }

    public static void main(String[] args) {
        CatalogoBibliotecaDuplicados catalogo = new CatalogoBibliotecaDuplicados();

        // Creamos dos libros diferentes pero con el mismo ISBN
        Libro l1 = new Libro("1984", "9780451524935", 2);
        Libro l2 = new Libro("1984 (Edición Especial)", "9780451524935", 1);

        System.out.println("--- Agregando primer libro ---");
        catalogo.agregarLibro(l1);

        System.out.println("\n--- Intentando agregar libro duplicado ---");
        try {
            catalogo.agregarLibro(l2);
        } catch (LibroDuplicadoException e) {
            System.err.println("Error de duplicado capturado: " + e.getMessage());
        }
    }
}