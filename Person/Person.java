class Person{
  private int age;
  private String name;
  // create a class
  public Person(int ageParam, String nameParam){
    this.age = ageParam;
    this.name = nameParam;
  }
  public void ObjectMethods(Person anotherOject){
    System.out.println("Class Name:" + this.getClass().getSimpleName());
    System.out.println("toString:" + this.toString());
    System.out.println("Equals:" + this.equals(anotherOject));
  }
}
