package org.academiadecodigo.gnunas.exceptions.Files;

import org.academiadecodigo.gnunas.exceptions.Exceptions.*;

/**
 * Created by codecadet on 13/10/2020.
 */
public class FileManager {

    private boolean isLogged;
    private File[] files;

    public FileManager(int space) {
        this.files = new File[space];
        this.isLogged = false;
    }

    public void login() throws LoginException {

        if (this.isLogged) {
            throw new LoginException("User already logged in !");
        }
        System.out.println("User logged in !");
        this.isLogged = true;

    }

    public void logout() throws LoginException {

        if (this.isLogged) {
            this.isLogged = false;
            System.out.println("User logged out !");
            return;
        }

        throw new LoginException("User not logged in yet !");
    }

    public File getFile(String name) throws FileNotFoundException, NotEnoughPermissionsException {

        if (this.isLogged) {

            for (File file : this.files) {

                if (file.getName().equals(name)) {
                    System.out.println("Found file named : " + name);
                    return file;
                }
            }

            throw new FileNotFoundException("File " + name + " not found !");
        }

        throw new NotEnoughPermissionsException("You're not logged in ! Couldn't look for the file...");
    }

    public File createFile(String name) throws NotEnoughPermissionsException, NotEnoughSpaceException {

        if (!this.isLogged) {

            throw new NotEnoughPermissionsException("You're not logged in ! Couldn't create any file !");
        }

        for (int fileIndex = 0; fileIndex < files.length; fileIndex++) {

            if (files[fileIndex] == null) {

                System.out.println("File " + name + " created !");
                this.files[fileIndex] = new File(name);
                return files[fileIndex];
            }
        }

        throw new NotEnoughSpaceException("Not enough space to create the file !");

    }

}
