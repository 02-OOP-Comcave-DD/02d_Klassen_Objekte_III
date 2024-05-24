package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
  private int age; 

  private int counter;

public Cat(String name, String furColor, int age) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
  }

public String getStringAttributes(String op) {
  switch (op) {
    case "#name":
      return name;
    case "#color":
      return furColor;
    default:
      return "ERROR!";
  }
}

public String getAge() {
    return checkCompliance();
  }

private String checkCompliance() {

  counter++;

    switch (counter) {
      case 1:
        return "Das geht Dich nix an, Frauen fragt man sowas nicht!";
      case 2:
        return "Hatte ich Dir nicht eben schon gesagt, das man sowas Frauen nicht fragt?";
      case 3:
        return "Es reicht, noch einmal und es platzt hier die Bombe!";
      case 4:
        return "%#1!  BUUUUMMMMM  !1#%: Der stellt jetzt keine Fragen mehr!!!";
      default:
        return "!!! Es ist AUS !!!";
    }
      
}    
}
  
