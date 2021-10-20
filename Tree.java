class Tree {
  String treeName;
  String treeType;
  boolean leavesFall;
  String leafColor;
  String blnRead;

  public Tree(){
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }
  public Tree(String aTreeName, String aTreeType, boolean ifLeavesFall, String aLeafColor){
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = ifLeavesFall;
    leafColor = aLeafColor;
  }
  void setTreeName(String Name){
    treeName = Name;
  }
  void setTreeType(String Type){
    treeType = Type;
  }
  void setLeavesFall(boolean Fall){
    leavesFall = Fall;
  }
  void setLeafColor(String Color){
    leafColor = Color;
  }
  String getName(){
    return treeName;
  }
  String getType(){
    return treeType;
  }
  boolean getFall(){
    return leavesFall;
  }
  String getColor(){
    return leafColor;
  }
  void print() {
    if (leavesFall == false){
    blnRead = "doesn't";
    }
    else {
      blnRead= "does";
    }
    System.out.println("This is a "+ treeName +" tree. It is a "+ treeType +" and its leaves are currently "+ leafColor +". It "+ blnRead +" lose its leaves for the winter.");
  }
}