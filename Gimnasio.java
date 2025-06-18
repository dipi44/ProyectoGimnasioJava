import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private String[] actividades = {"Yoga", "Boxeo", "Funcional"};
    private ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();

    public Gimnasio(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }

    public void registrarUsuario(String nombreUsuario) {
        Usuario nuevoUsuario = new Usuario(nombreUsuario);
        usuariosRegistrados.add(nuevoUsuario);
        System.out.println("Usuario " + nombreUsuario + " registrado en el gimnasio " + nombre + ".");
    }

    public void listarUsuarios() {
        System.out.println("Usuarios registrados en el gimnasio " + nombre + ":");
        for (Usuario u : usuariosRegistrados) {
            System.out.println("- " + u.getNombre());
        }
    }

    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("Juan Perez");
        miGimnasio.registrarUsuario("Ana Gómez");
        miGimnasio.listarUsuarios();
    }
}
