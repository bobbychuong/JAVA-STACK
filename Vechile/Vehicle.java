class Vehicle {
  private int numberOfWheels;
  private String color;
  // Getter
  public int getNumberOfWheels() {    // Passing number in to method
    return numberOfWheels;                      // Returning private int
  }
  // Setter
  public void setNumberOfWheels(int number){
    numberOfWheels = number;
  }
  // Getter
  public String getColor(){
    return color;
  }
  // Setter
  public void setColor(String c){
    color = c;
  }
}

// class Vehicle {
//   private int numberOfWheels;
//   private String color;
//   public Vehicle(String color){
//     // Setting the color attribute to the value from the color paramter
//     this.color = color;
//   }
//   public String getColor(){
//     return color;
//   }
//   // ...
//   // getters and setters removed for brevity
//   // ...
// }
