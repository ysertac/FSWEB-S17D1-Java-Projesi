package com.workintech.s17d1.Utils;

import com.workintech.s17d1.entity.Animal;

public class ValidationUtils {
    public static void checkId(Integer id) {
        if (id == null) {
            System.out.println("id null olamaz");
        }
    }

    public static void checkAnimal(Animal animal) {
        if (animal.getId() == null) {
            System.out.println("id null olamaz");
        }
        if (animal.getName().isEmpty()) {
            System.out.println("Name null ya da boş olamaz.");
        }
    }
}
