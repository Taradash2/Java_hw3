package HW.Java_hw3;

public class progOne {
    
    public static void main(String[] args) {
        ArrayList<Integer> numb = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
         numb.add((int)(Math.random() * 100));
    
}
        System.out.println(numb);
            for (int i = numb.size() - 1; i >= 0; i--) {
    if(i%2 != 0){
        numb.remove(i);
    }
    
}
            System.out.println(numb);
}

}
    

