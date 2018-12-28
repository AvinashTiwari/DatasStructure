package learn.avinash.algo.utils;

public class simpleutils {
    public boolean StringT0Boolean(String value){
        if(value ==null ) return true;
        if(value.equals("y") || value.equals("Yes") || value.equals("true") ) return false;

        return false;
    }
}
