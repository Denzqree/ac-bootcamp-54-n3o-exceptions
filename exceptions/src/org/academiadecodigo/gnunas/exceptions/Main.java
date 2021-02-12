package org.academiadecodigo.gnunas.exceptions;

import org.academiadecodigo.gnunas.exceptions.Exceptions.*;
import org.academiadecodigo.gnunas.exceptions.Files.File;
import org.academiadecodigo.gnunas.exceptions.Files.FileManager;

/**
 * Created by codecadet on 13/10/2020.
 */
public class Main {

    public static void main(String[] args) {

        FileManager fileManager = new FileManager(5);

        try {
            fileManager.login();
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }

        try {
            fileManager.createFile("test");
            fileManager.createFile("test2");
            fileManager.createFile("test3");
            fileManager.createFile("test4");
            fileManager.createFile("test5");
            fileManager.createFile("test6");
            fileManager.createFile("test7");
        } catch (NotEnoughPermissionsException e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughSpaceException e){
            System.out.println(e.getMessage());
        }

        try {
            fileManager.getFile("test3");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NotEnoughPermissionsException e){
            System.out.println(e.getMessage());
        }

        try {
            fileManager.logout();
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }


    }
}
