package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] personas) {
        showConsole = new ShowConsole();
        this.people = personas;
        showPerson();
    }

    public int busquedaLineal(int[] array, int busqueda) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == busqueda) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param code a buscar
     * @return posicion de la persona encontrada
     */
    public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }
    public void showPerson(){
        int codeToFind=showConsole.hashCode();
        int indexPerson =findPersonByCode(codeToFind);
        if (indexPerson>=0) {
            showConsole.showMessage("persona con codigo: " + codeToFind +", Encontrado");
            showConsole.showMessage(people[indexPerson].toString());
            
        }else{
            showConsole.showMessage("Personano encontrada");
        }
    }
    public int findPersonByName(String name) {
        return -1;s
    }
    public void showPersonByName() {
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con nombre: " + nameToFind + ", Encontrado");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }
}
