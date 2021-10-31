package TP5.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelector <T>{

    private List<T> elements = new ArrayList<T>();
    public Random rnd = new Random();

    public void add (T element){
        getElements().add(element);
    }

    public T selectNext() throws IndexOutBoundsException{
        if(getElements().size() == 0)
            throw new IndexOutBoundsException();

        int randomInt = rnd.nextInt(getElements().size());
        return getElements().get(randomInt);
    }

    private List<T> getElements(){
        return elements;
    }

    public static void main(String[] args) {
        RandomSelector<String> rs = new RandomSelector<>();

        rs.add("Dai");
        rs.add("BolaDeNieve");
        rs.add("Ignaci");
        rs.add("Bokita");

        for (int x=1; x<10; x++){
            try{
                System.out.println(rs.selectNext());
            } catch (IndexOutBoundsException e){
                e.printStackTrace();
            }
        }
    }
}
