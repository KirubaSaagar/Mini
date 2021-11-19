package com.Ada.Helper;

public class Ada_FRM {
	
	private Ada_FRM() {

	}
	
	public static Ada_FRM getInstanceAdaFRM() {

		Ada_FRM reader = new Ada_FRM();
		
		return reader;
			
	}

	public AdaConfiguration_Reader getInstanceAdaCr() throws Throwable {

		AdaConfiguration_Reader reader = new AdaConfiguration_Reader();
		
		return reader;
		
		
	}
	
	
}
