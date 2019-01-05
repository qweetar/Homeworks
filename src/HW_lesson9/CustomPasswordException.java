package HW_lesson9;

public class CustomPasswordException extends Exception {
    private String customPasswordMessage;

    CustomPasswordException(String s) {
        customPasswordMessage = this.getMessage() + s;
    }

    public String getCustomPasswordMessage() {return customPasswordMessage;}

    @Override
    public String toString() {return super.toString() + customPasswordMessage;}

}
