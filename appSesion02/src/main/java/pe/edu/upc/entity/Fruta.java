package pe.edu.upc.entity;

public class Fruta 
{
	//Atributos de instancia (objeto)
	private String color;
	private String sabor;
	
	//Atributos de clase (static)
	public static String LugarOrigen="UPC";

	//static se utiliza para que un atributo o un metodo pertenezca a la clase mas no al objeto
	
	//Constructor
	public Fruta(String color, String sabor) 
	{
		super();
		this.color = color;
		this.sabor = sabor;
	}
	
	public static void SoyunMetodoGlobal()
	{
		
	}
	
	public void SoyunMetodoObjeto()
	{
		LugarOrigen="HOLA";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return this.getColor();
	}
}
