package Encapsulation.Persons;
import Encapsulation.Datea.datas;
import java.util.Date;

public class Persons {
    public static void main(String[] args){
    datas dataobj = new datas();   
    dataobj.setName("Hurvan");
    dataobj.getName();
    dataobj.setdate(new Date());
    dataobj.getdate();
    }
}
