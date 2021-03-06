package nz.co.application.example_app.pineapple.domain.lockSmith;

public class LockSmith {

  /*
  A simple lockSmith class that will be used to open the lock class.
  A LockSmith must have the following details by default, therefore we have created a constructor on the class.
   */

  private String name;
  private int pin;
  private int lockNumber;

  public LockSmith(String name, Integer pin, Integer lockNumber){
    this.name = name;
    this.pin = pin;
    this.lockNumber = lockNumber;
  }
  public int getKey(int pin, int lockNumber){
    return pin+lockNumber;
  }
  public int getPin() {
    return this.pin;
  }
  public int getLockNumber() {
    return lockNumber;
  }
  public String getName() {
    return name;
  }
}
