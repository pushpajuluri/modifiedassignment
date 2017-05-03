package weekendtest;

public class Kitten implements Ikitten {
	private String name;
	private Person owner;
	private int age;
	public Kitten( String name, Person owner )
	{
	setName( name );
	setOwner( owner );
	age = 0;
	}
	public void setName( String newName )
	{
	name = newName + " the Feline";
	}
	public String getName()
	{
	return name;
	}
	public void setOwner( Person newOwner )
	{
	owner = newOwner;
	}
	public Person getOwner()
	{
	return owner;
	}
	public void haveBirthday()
	{
	++age;
	}
	public int getAge()
	{
	return age;
	}
	public String toString()
	{
	return name+" is "+age+" and belongs to "+owner.getName();
	}

}
