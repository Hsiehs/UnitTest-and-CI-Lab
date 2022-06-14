public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }

}

