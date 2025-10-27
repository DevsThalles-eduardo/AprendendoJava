package POO;

public class Person {
    // Atribuir de classe
   private String name;
   private int age;
    // construtor
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    //Getters and Setters
    public String getName(){return this.name; };
    public int getAge(){return this.age;};
    public void setName(String name){this.name = name;};
    public void setAge(int age){this.age = age;};
    // Metodo da classe
    public void apresentarPessoal(){System.out.println("Nome: " + getName() + "\nIdade: " + getAge());}
}
