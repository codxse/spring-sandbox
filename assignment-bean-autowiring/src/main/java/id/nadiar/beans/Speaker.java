package id.nadiar.beans;

public class Speaker implements ISpeaker {
    @Override
    public void makeSound() {
        System.out.println("Base speaker sound!");
    }
}
