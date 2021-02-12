package org.academiadecodigo.gnunas.exceptions.Exceptions;

/**
 * Created by codecadet on 13/10/2020.
 */
public class NotEnoughSpaceException extends FileException{

    public NotEnoughSpaceException(){

    }

    public NotEnoughSpaceException(String s){
        super(s);
    }
}
