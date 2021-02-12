package org.academiadecodigo.gnunas.exceptions.Exceptions;

/**
 * Created by codecadet on 13/10/2020.
 */
public class NotEnoughPermissionsException extends FileException{

    public NotEnoughPermissionsException(){

    }

    public NotEnoughPermissionsException(String s){
        super(s);
    }
}
