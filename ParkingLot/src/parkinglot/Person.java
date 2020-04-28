/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parkinglot;


public class Person {
    
    public String Name;
    public String ID;
    public String PhoneNumber;
    public String Title;
    
    Person(String name,String id, String phoneNo, String title){
    name=this.Name;
    id=this.ID;
    phoneNo=this.PhoneNumber;
    title=this.Title;
    
    }
    public String getName(){
    
    return Name;
    }
    public void setName(String name){
        name=this.Name;
    }
    
    public String getID(){
    
    return ID;
    }
    public void setID(String id){
        id=this.ID;
    }
    
    public String getPhoneNo(){
    
    return PhoneNumber;
    }
    public void setPhoneNo(String phone){
        phone=this.PhoneNumber;
    }
    
    public String getTitle(){
    
    return Title;
    }
    public void setTitle(String title){
        title=this.Title;
    }
    
}
class staff extends Person{

    public staff(String name, String id, String phoneNo, String title) {
        super(name, id, phoneNo, title);
    }


}
class Students extends Person{

    public Students(String name, String id, String phoneNo, String title) {
        super(name, id, phoneNo, title);
    }

}
