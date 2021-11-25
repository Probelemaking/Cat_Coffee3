package Exceptions;

import Entities.Cat;

public class CatNotFoundException extends RuntimeException{
    CatNotFoundException(){
        super();
    }
    public CatNotFoundException(String message) {
        super(message);
    }
}
