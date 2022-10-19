public class LinearEquation {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private String cord1;
    private String cord2;

    public LinearEquation(String cord1,String cord2)
    {
        this.cord1=cord1;
        this.cord2=cord2;
        x1=Integer.parseInt(cord1.substring(1,2));
        x2=Integer.parseInt(cord2.substring(1,2));
        y1=Integer.parseInt(cord1.substring(3,cord1.length()-1).trim());
        y2=Integer.parseInt(cord2.substring(3,cord2.length()-1).trim());
    }

    public double slope()
    {
        return Math.round((y2-y1)/(x2-x1)*100)/100;
    }
    public double distance()
    {
    return Math.round(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2))*100)/100;
    }

    public double yIntercept()
    {
        return Math.round(slope()*x1-y1);
    }

    public String equation()
    {
        int deltaY=Math.abs(y2-y1);
        int deltaX=Math.abs(x2-x1);
        if(slope()<0) return "y=-" + deltaY + "/" + deltaX + "x"+yIntercept();
        return "y="+deltaY+"/"+deltaX+"x"+yIntercept();
    }
}
