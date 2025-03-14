package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa un contacto con un nombre y una lista de números de teléfono.
 */
class Persona {
    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    private String name;
    private List<String> phones;
    /**
     * Constructor de la clase Contacto.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de teléfono inicial del contacto.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }
    /**
     * Obtiene el nombre del contacto.
     *
     * @return Nombre del contacto.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Obtiene la lista de números de teléfono del contacto.
     *
     * @return Lista de números de teléfono.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}