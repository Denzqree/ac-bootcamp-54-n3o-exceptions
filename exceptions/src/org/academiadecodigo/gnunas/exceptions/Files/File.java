package org.academiadecodigo.gnunas.exceptions.Files;

import org.academiadecodigo.gnunas.exceptions.Exceptions.FileNotFoundException;

/**
 * Created by codecadet on 13/10/2020.
 */
public class File{

    private String name;

    public File(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
