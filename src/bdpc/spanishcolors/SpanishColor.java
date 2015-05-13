package bdpc.spanishcolors;

public enum SpanishColor {

	BLUE("blue", "azul", "azules"),
	RED("red", "rojo", "roja", "rojos", "rojas"),
	BROWN("brown", "marrón", "marrón", "marrones", "marrones"), //ó is alt+0243
	VIOLET("violet", "violeta", "violeta", "violeta", "violeta"),
	//PURPLE("purple", "morado", "?", "?", "?"), // ??
	BLACK("black", "negro", "negra", "negros", "negras"), //is this right?
	WHITE("white", "blanco", "blanca", "blancos", "blancas"),
	//GOLD("gold", "dorado", "?", "?", "?"),
	GRAY("gray", "gris", "grises"),
	YELLOW("yellow", "amarillo", "amarilla", "amarillos", "amarillas"),
	GREEN("green", "verde", "verdes"),
	//ORANGE:  naranja vs anaranjado
	//purple2:  púrpura  //alt+0250
	//creme:  crema 
	//pink:  rosa
	//coffee:  café //alt+0233
	//silver:  plateado
	;
	
	private final String english;
	
	private final String mSingular;
	
	private final String fSingular;
	
	private final String mPlural;
	
	private final String fPlural;
	
	private SpanishColor(String english, String singular, String plural){
		this(english, singular, singular, plural, plural);
	}
	
	private SpanishColor(String english, String mSingular, String fSingular, String mPlural, String fPlural){
		this.english = english;
		this.mSingular = mSingular;
		this.fSingular = fSingular;
		this.mPlural = mPlural;
		this.fPlural = fPlural;
	}
	
	public String english(){
		return english;
	}
	
	public String spanish(boolean masculine, boolean singular){
		return singular ? spanishSingular(masculine) : spanishPlural(masculine);
	}
	
	public String spanishSingular(boolean masculine){
		return masculine ? mSingular : fSingular;
	}
	
	public String spanishPlural(boolean masculine){
		return masculine ? mPlural : fPlural;
	}
	
	
}
