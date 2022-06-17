package id.nadiar.beans;

public class SonySpeaker implements ISpeaker {
    @Override
    public void makeSound() {
        System.out.println("Sound from sony");
    }
}
