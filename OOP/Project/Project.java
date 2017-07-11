// Create a Project class that has the fields of name and description.
// Create an instance method called elevatorPitch that will return the name and description separated by a colon.
// Overload the constructor method in three different ways.
// public Project() {}
// public Project(String name) {}
// public Project(String name, String description) {}
// Create getter and setters for each field
// Create a ProjectTest file that will test all the functionality.
class Project {
  private String name;
  private String description;
  // Getter
  public String getProjectName(){
    return name;
  }
  // Setter
  public void setName(String name){
    this.name = name;
  }
  public String getDescription(){
    return description;
  }
  public void setDescription(String description){
    this.description = description;
  }
}
