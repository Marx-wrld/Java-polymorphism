class Bird{
    public void sing(){
        System.out.println("Tweet tweet tweet");
    }
}
class Robin extends Bird{
    //public void sing(){
   //     System.out.println("Twindledee");
   // }

    public static void main(String[] args){
        Robin b = new Robin();
        b.sing();
}
}