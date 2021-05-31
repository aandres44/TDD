import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TDD {

    // We need to get the size of the list

    @Test
    public void listSizeTest1() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // ¿qué es lo que queremos probar?
        assertEquals(4, list.size());
    }

    @Test
    public void listSizeTest2() {
        // Inicialización/escenario
        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("profe");
        list.add("como");
        list.add("esta");

        list.remove(0);

        // ¿qué es lo que queremos probar?
        assertEquals(3, list.size());
    }

    @Test
    public void listSizeTest3() {
        // Inicialización/escenario
        List<Double> list = new ArrayList<>();
        list.add(1.2);
        list.add(2.6);
        list.add(3.1);
        list.add(4.8);

        // ¿qué es lo que queremos probar?
        assertEquals(4, list.size());
    }

    // We need to clear the list

    @Test
    public void listEmpty1() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list = new ArrayList<>();
        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

    @Test
    public void listEmpty2() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.remove(0);


        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

    @Test
    public void listEmpty3() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.clear();

        // ¿qué es lo que queremos probar?
        assertEquals(0, list.size());
    }

    // We need to add Items

    @Test
    public void listAdd1() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();

        assertEquals(0, list.size());

        list.add(7);
        // ¿qué es lo que queremos probar?
        assertEquals(1, list.size());
    }

    @Test
    public void listAdd2() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();

        list.add(91);

        assertEquals(1, list.size());

        list.add(7);
        // ¿qué es lo que queremos probar?
        assertEquals(2, list.size());
    }

    @Test
    public void listAdd3() {
        // Inicialización/escenario
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);

        assertEquals(2, list.size());

        list.add(7);
        // ¿qué es lo que queremos probar?
        assertEquals(3, list.size());
    }

    // We need to be able to check if an item exists

    @Test
    public void listItem1() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertTrue(list.contains(85));
    }

    @Test
    public void listItem2() {
        List<Integer> list = new ArrayList<>();

        assertFalse(list.contains(2));
    }

    @Test
    public void listItem3() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertTrue(list.contains(14));
    }

    // We need to get elements by index

    @Test
    public void listIndex() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertEquals(14, (int) list.get(0));
    }

    @Test
    public void listIndex2() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertEquals(85, (int) list.get(1));
    }

    @Test
    public void listIndex3() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertEquals(90, (int) list.get(2));
    }

    // We need to search the index of an object

    @Test
    public void listGetIndex1() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertEquals(2, list.indexOf(90));
    }

    @Test
    public void listGetIndex2() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertNotEquals(3, list.indexOf(14));
    }

    @Test
    public void listGetIndex3() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertEquals(1, list.indexOf(85));
    }

    // We need to remove an item by index

    @Test
    public void listRmIndex1() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertEquals(3, list.size());

        list.remove(1);

        assertFalse(list.contains(85));
        assertEquals(2, list.size());
    }

    @Test
    public void listRmIndex2() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertEquals(3, list.size());

        list.remove(2);
        list.remove(0);

        assertTrue(list.contains(85));
        assertEquals(1, list.size());
    }

    @Test
    public void listRmIndex3() {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(85);
        list.add(90);

        assertEquals(3, list.size());

        list.remove(0);
        list.remove(0);

        assertTrue(list.contains(90));
        assertEquals(1, list.size());
    }

}