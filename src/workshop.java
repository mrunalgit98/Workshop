//write a program to take input parameter id,firstname,lastname,emailid,phone number,fistdate,lastdate
//create multiple person
//use regix pattern validate person


public class workshop {
    int id;
    String firstname;
    String lastname;
    String email;
    Long Phoneno;
    String firstdate;
    String Lastdate;

    public void multiplePerson(int id, String firstname, String lastname, String email, Long phoneno, String firstdate, String lastdate){

        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.Phoneno=phoneno;
        this.firstdate=firstdate;
        this.Lastdate=lastdate;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public Long getPhoneno(){
        return Phoneno;
    }
    public void setPhoneno(Long phoneno){
        this.Phoneno=Phoneno;
    }
    public String getFirstdate(){
        return firstdate;
    }
    public void setFirstdate(){
        this.firstdate=firstdate;
    }
    public String getLastdate(){
        return Lastdate;
    }
    public void setLastdate(){
        this.setLastdate();
    }
    public void display(){
        System.out.println("Id " + id );
        System.out.println("Firstname " +firstname );
        System.out.println("lastname " +lastname);
        System.out.println("phone number " +Phoneno);
        System.out.println("first date " + firstdate);
    }

}
