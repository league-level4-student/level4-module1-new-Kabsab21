package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	String f = "";
    	System.out.println(unfunkifiedText);
    	for(int i = 0; i < unfunkifiedText.length(); i++) {
    		f = f+unfunkifiedText.charAt(unfunkifiedText.length()-i-1);
    		System.out.println(f);
    	}
        return f;

    }
}
