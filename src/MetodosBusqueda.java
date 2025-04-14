public class MetodosBusqueda {
    public int busquedaLineal(int[] array, int busqueda) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == busqueda) {
                return i;
            }
        }
        return -1;
    }
}
