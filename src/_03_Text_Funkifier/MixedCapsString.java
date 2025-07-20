package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		String f = "";
    	unfunkifiedText = unfunkifiedText.toLowerCase();
    	
    	for(int i = 0; i < unfunkifiedText.length(); i++) {
    		
    		
    		if(i == unfunkifiedText.length()-1) {
    			f = unfunkifiedText.charAt(unfunkifiedText.length()-i -1)+f;
				;
				System.out.println(f);
    		}else if( (unfunkifiedText.length()-i -1)%2 != 0 ) {
    			System.out.println("gyat");
    			f = unfunkifiedText.toUpperCase().charAt(unfunkifiedText.length()-i -1)+f;
    					
        		System.out.println(f);
    		}else {
    			f = unfunkifiedText.charAt(unfunkifiedText.length()-i -1)+f;
    		System.out.println(f);

    		}

        		
        		
    		
    		    	}
        return f;
		
	}

}
