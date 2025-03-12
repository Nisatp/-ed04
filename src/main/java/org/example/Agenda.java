package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Clase que representa una agenda de contactos.
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto
    /**
     * Constructor que inicializa la lista de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }
    /**
     * Agrega un contacto a la agenda. Si el contacto ya existe, se agrega el nuevo número a su lista de teléfonos.
     *
     * @param name  Nombre del contacto.
     * @param phone Número de teléfono del contacto.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }
    /**
     * Elimina un contacto de la agenda por su nombre.
     *
     * @param name Nombre del contacto a eliminar.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }
    /**
     * Modifica un número de teléfono de un contacto existente.
     *
     * @param name     Nombre del contacto.
     * @param oldPhone Número de teléfono antiguo.
     * @param newPhone Nuevo número de teléfono.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }
    /**
     * Obtiene la lista de contactos almacenados en la agenda.
     *
     * @return Lista de contactos.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}