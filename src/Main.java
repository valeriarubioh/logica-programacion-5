import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        List<String> clave = new ArrayList<>();
        hashMap.put("Casa", "House");
        hashMap.put("Perro", "Dog");
        hashMap.put("Gato", "Cat");
        hashMap.put("Mesa", "Table");
        hashMap.put("Silla", "Dog");
        hashMap.put("Libro", "Book");
        hashMap.put("Agua", "Water");
        hashMap.put("Sol", "Sun");
        hashMap.put("Luna", "Moon");
        hashMap.put("Árbol", "Tree");
        hashMap.put("Coche", "Car");
        hashMap.put("Tren", "Train");
        hashMap.put("Avión", "Airplane");
        hashMap.put("Manzana", "Apple");
        hashMap.put("Naranja", "Orange");
        hashMap.put("Zapato ", "Shoe");
        hashMap.put("Camisa", "Shirt");
        hashMap.put("Pantalón", "Pants");
        hashMap.put("Amigo", "Friend");
        hashMap.put("Familia", "Family");
        for(String palabra: hashMap.keySet()){
            clave.add(palabra);
        }
        int contador = 0;
        HashMap<String, String> nuevoHashMap = new HashMap<>();
        for(int i=0;i<5;i++){
            int numero = (int) (Math.random()*hashMap.size());
            String randomKey = clave.get(numero);
            System.out.println("Traduce "+randomKey+":");
            String word = scan.next();
            if(hashMap.get(randomKey).equalsIgnoreCase(word)) {
                contador++;
            }
        }
        System.out.println("Aciertos: "+contador + " palabras. Errores:  "+(5-contador));
    }
}