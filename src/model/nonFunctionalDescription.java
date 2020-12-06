package model;

public class nonFunctionalDescription extends Description
{
    private String description;

    public nonFunctionalDescription(String description)
    {
        super(false);
        this.description = description;
    }

    public void setNonFunctionalDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String[] getDescription()
    {
        String[] output = new String[1];
        output[0] = description;
        return output;
    }

    public String toString()
    {
        return description;
    }
}
