
/**
*	@overview MobilePhone : A wireless telecommunications device used for making and receiving calls,sending messages.
*
*	Attributes
*	manName     String        String
*	model       String        String
*	color	    Charactor     char 
*	year	    Integer		  int
*	guaranteed  Boolean		  bool
*
*	@object
*	A typical mobilephone <mn,m,c,y,g> where manName<mn>, model<m>, color<c>, year<y>, guaranteed<g>.
*
*	@abstract_properties
*	mutable(manName) = false /\ optional = false /\ length = 30;
*	mutable(model) = false /\ optional = true /\ length = 20 /\ model.match("M-letter(3)-digital(3)") = true /\;
*	mutable(color) = true /\ optional = true /\ length = 10 /\ color in {'R', 'G', 'B', 'W','P'} /\;
*	mutable(year) = false /\ optional = false /\ MIN = 1970;
*	mutable(guaranteed) = true /\ optional = true /\ ;
*/
public class MobilePhone{
	@DomainConstraint(type="String",mutable=false,optional=false,length=30)
	private String manName;

	@DomainConstraint(type="String",mutable=false,optional=true,length=20)
	private String model;
	
	@DomainConstraint(type="Char",mutable=true,optional=true,length=1)
	private Char color;
	
	@DomainConstraint(type="Integer",mutable=false,optional=false,length=4)
	private int year;
	
	@DomainConstraint(type="Boolean",mutable=true,optional=true,length=30)
	private Boolean guaranteed;
	/**
	* effects
	* if mn,m,c,y,g are valid
	*
	*/
	public Person(String manName, String model, Char color,int year,Boolean guaranteed){
		
		if(!validateManName(mn)) {
			throw new NotPossibleException(
				"MobilePhone init: Invalid MobilePhone manName:" + mn
				);
		}

		if(!validateModel(m)) {
			throw new NotPossibleException(
				"MobilePhone init: Invalid MobilePhone model:" + m
				);
		}

		if(!validateColor(c)) {
			throw new NotPossibleException(
				"MobilePhone init: Invalid MobilePhone Color:" + c
				);
		}

		if(!validateYear(y)) {
			throw new NotPossibleException(
				"MobilePhone init: Invalid MobilePhone year:" + y
				);
		}

		if(!validateGuaranteed(mn)) {
			throw new NotPossibleException(
				"MobilePhone init: Invalid MobilePhone guaranteed:" + g
				);
		}


		this.manName = manName
		this.model = model
		this.color = phone
		this.year = year
		this.guaranteed = guaranteed
	}

	/**
	* @effect
	* 	return manName
	*/
	@DOpt(type=Opt.Observer) @AttrRef("manName")
	public String getManName(){
		return manName;
	}

	/**
	* @effect
	* 	return model
	*/
	@DOpt(type=Opt.Observer) @AttrRef("model")
	public String getModel(){
		return model;
	}

	/**
	* @effect
	* 	return color
	*/
	@DOpt(type=Opt.Observer) @AttrRef("color")
	public char getColor(){
		return color;
	}

	/**
	* @effect
	* 	return year
	*/
	@DOpt(type=Opt.Observer) @AttrRef("year")
	public int getYear(){
		return year;
	}

	/**
	* @effect
	* 	return guaranteed
	*/
	@DOpt(type=Opt.Observer) @AttrRef("guaranteed")
	public bool guarenteed(){
		return guarenteed;
	}

	/**
	* @effects
	*	if mn is valid
	*		set this.manName = mn;
	*		return true
	*	else
	*		return false
	*/
	@Dopt(type=Opt.Type.Mutator) @AttrRef("manName")
	public boolean setManName(String mn){
		if(validateManName(mn)){
			this.manName = mn;
			return true;
		} else {
			return false;
		}
	}

	/**
	* @effects
	*	if m is valid
	*		set this.model = m;
	*		return true
	*	else
	*		return false
	*/
	@Dopt(type=Opt.Type.Mutator) @AttrRef("model")
	public boolean setModel(String m){
		if(validateModel(m)){
			this.mode = m;
			return true;
		} else {
			return false;
		}
	}

	/**
	* @effects
	*	if c is valid
	*		set this.color = c;
	*		return true
	*	else
	*		return false
	*/
	@Dopt(type=Opt.Type.Mutator) @AttrRef("color")
	public boolean setColor(Char c){
		if(validateColor(c)){
			this.color = c;
			return true;
		} else {
			return false;
		}
	}

	/**
	* @effects
	*	if y is valid
	*		set this.year = y;
	*		return true
	*	else
	*		return false
	*/
	@Dopt(type=Opt.Type.Mutator) @AttrRef("year")
	public boolean setYear(int y){
		if(validateYear(y)){
			this.year = y;
			return true;
		} else {
			return false;
		}
	}

	/**
	* @effects
	*	if g is valid
	*		set this.guaranteed = g;
	*		return true
	*	else
	*		return false
	*/
	@Dopt(type=Opt.Type.Mutator) @AttrRef("guranteed")
	public boolean setGuaranteed(bool mn){
		if(validateGuaranteed(g)){
			this.guaranteed = g;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString(){
		// return "MobilePhone: <" + mn + "," + m + "," + c + "," + y + "," + g + ">";
		return String.format("MobilePhone: <%f,%f,%c,%d,%b>, mn,m,c,y,g");
	}

	/**
	* @effects<pre>
	*	if this satisfies absatract properties
	*		return true
	*	else
	*		return false
	*	</pre>
	*/
	public boolean repOk(){}

	/**
	* @effects <pre>
	*	if mn is valid 
	*		return true
	*	else 
	*		return false
	*	</pre>
	*/
	private boolean validateManName(int mn){
		if(mn != NULL) {
			return true;
		}
		return false;
	}

	/**
	* @effects <pre>
	*	if m is valid 
	*		return true
	*	else 
	*		return false
	*	</pre>
	*/
	private boolean validateModel(int m){
		if(m != NULL) {
			return true;
		}
		return false;
	}

	/**
	* @effects <pre>
	*	if c is valid 
	*		return true
	*	else 
	*		return false
	*	</pre>
	*/
	private boolean validateColor(int c){
		if(c != NULL) {
			return true;
		}
		return false;
	}

	/**
	* @effects <pre>
	*	if y is valid 
	*		return true
	*	else 
	*		return false
	*	</pre>
	*/
	private boolean validateYear(int y){
		if(y >= 2010, y <= 2025) {
			return true;
		}
		return false;
	}

	/**
	* @effects <pre>
	*	if g is valid 
	*		return true
	*	else 
	*		return false
	*	</pre>
	*/
	private boolean validateGuaranteed(int g){
		if(g != NULL) {
			return true;
		}
		return false;
	}

}
