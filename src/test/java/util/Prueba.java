package util;

/**
 * Ayudante para las pruebas: cuenta cuantas salen bien y cuantas fallan.
 */
public class Prueba {

    private static int ok = 0;
    private static int fallas = 0;

    /** Imprime el nombre del grupo de pruebas. */
    public static void titulo(String nombre) {
        System.out.println("=== " + nombre + " ===");
    }

    /** Muestra OK o FALLA segun la condicion y lo cuenta. */
    public static void verificar(boolean condicion, String descripcion) {
        if (condicion) {
            ok++;
            System.out.println("  OK    " + descripcion);
        } else {
            fallas++;
            System.out.println("  FALLA " + descripcion);
        }
    }

    /** OK si la accion lanza esa excepcion; FALLA si no lanza ninguna o lanza otra. */
    public static void esperarExcepcion(Class<? extends Throwable> tipo,
                                        Runnable accion, String descripcion) {
        try {
            accion.run();
            fallas++;
            System.out.println("  FALLA " + descripcion + " (no lanzo excepcion)");
        } catch (Throwable t) {
            if (tipo.isInstance(t)) {
                ok++;
                System.out.println("  OK    " + descripcion);
            } else {
                fallas++;
                System.out.println("  FALLA " + descripcion
                        + " (lanzo " + t.getClass().getSimpleName() + ")");
            }
        }
    }

    /** Muestra el total de OK y FALLA; si hubo fallas, termina con codigo 1. */
    public static void resumen() {
        System.out.println(ok + " OK, " + fallas + " fallas");
        if (fallas > 0) {
            System.exit(1);
        }
    }
}