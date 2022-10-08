package Encapsulation.Datea;
import java.util.Date;

public class datas {
    private String name; // private = restricted access
    private Date adate;
  /*
    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    } */

    public void setName(String s) {
        name = s;
    }
    public String getName() {
        System.out.println(name);
        return name;//This ...
      }

    public void setdate(Date d){
        adate = d;
    }
    public Date getdate(){
        System.out.println(adate);
        return adate;//and this is not work on my pc, why?
    }
  }
