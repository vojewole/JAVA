import java.util.Random;

public class PuzzleJava{

  public int[] getTenRolls(){

    Random tenRolls = new Random();
    int[] tenRollsArray = new int[10];

    for(int i=0; i<tenRollsArray.length; i++){
      tenRollsArray[i] = tenRolls.nextInt(20);
      System.out.println(tenRollsArray[i]);
    }
    return tenRollsArray;

  }

  public String getRandomLetter(){
    String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    Random alphabetIndex = new Random();
    return alphabet[alphabetIndex.nextInt(25)];
  }

  public String generatePassword(){
    String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    Random alphabetIndex = new Random();
    String password="";
    for(int i=0; i<=7; i++){
      password = password + alphabet[alphabetIndex.nextInt(25)];
    }
    return password;
  }

  public String[] getNewPasswordSet(int arrayLength){
    String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] passwordSet = new String[arrayLength];
    Random alphabetIndex = new Random();

    for(int i=0; i < passwordSet.length; i++){

      String password="";
      for(int j=0; j<=7; j++){
        password = password + alphabet[alphabetIndex.nextInt(25)];
        }
        passwordSet[i] = password;
        System.out.println(passwordSet[i]);
    }

    return passwordSet;
  }

}