package _03_Text_Funkifier;

public class FreakinatorString implements TextFunkifier {

	    private String unfunkifiedText;

	    public FreakinatorString(String unfunkifiedText) {

	        this.unfunkifiedText = unfunkifiedText;

	    }

		@Override
		public String funkifyText() {
			String f = "";
	    	
	    	
	    	for(int i = 0; i < unfunkifiedText.length(); i++) {
	    		
	    		
	    	//	if(i == unfunkifiedText.length()-1) {
	    	//		f = unfunkifiedText.charAt(unfunkifiedTex t.length()-i -1)+f;
			//		;
			//		System.out.println(f);
	    		if( unfunkifiedText.charAt(i) == 'm') {
	    			System.out.println("gyat");
	    			f = "ak"+f;
	    					
	        	
	    		}else {
	    			f = unfunkifiedText.charAt(unfunkifiedText.length()-i -1)+f;
	    		System.out.println(f);

	    		}

	        		
	        		
	    		
	    		    	}
	        return f;
			
		}

	}


