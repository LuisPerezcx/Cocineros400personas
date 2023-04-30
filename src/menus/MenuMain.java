package menus;

import cocineros.Cocinero;

import java.util.ArrayList;

public class MenuMain {
    Cocinero cocinero = new Cocinero();
    ArrayList<Cocinero> cocineroArrayList = new java.util.ArrayList<>();;
    private void cocinerosDefault(){
        cocinero = new Cocinero("Diego Lopez",1);
        cocineroArrayList.add(cocinero);
        cocinero = new Cocinero("Juan Zambrano",2);
        cocineroArrayList.add(cocinero);
        cocinero = new Cocinero("Maria Herrera",1.30);
        cocineroArrayList.add(cocinero);
        cocinero = new Cocinero("Alejandro Peralta",2);
        cocineroArrayList.add(cocinero);
        cocinero = new Cocinero("Gilberto Herrera",3);
        cocineroArrayList.add(cocinero);
        cocinero = new Cocinero("Mario Martinez",5);
        cocineroArrayList.add(cocinero);
    }
    public void mostrar(){
        cocinerosDefault();
        System.out.println("Equipo de cocina para 400 personas");
        System.out.print("\nOBJETO \t\t\t NOMBRE \t\tTIEMPO(SEGUNDOS)\t\t\tEspecialidad\n");
        System.out.println("---------------------------------------------------------------------------------");
        for (Cocinero current : cocineroArrayList) {
            System.out.println(current);
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Tiempo total obtenido por el equipo de cocina: " + cocinero.getTiempoCocinaEquipo());
    }
}
