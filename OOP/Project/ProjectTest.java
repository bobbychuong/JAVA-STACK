class ProjectTest{
  public static void main(String[] args){
    Project name = new Project();
    Project description = new Project();
    name.setName("Project 1");
    description.setDescription("Description 1");
    String nameName = name.getProjectName();
    String dDescript = description.getDescription();
    System.out.println("Name:" + nameName + "Description:" + dDescript);
  }
}
