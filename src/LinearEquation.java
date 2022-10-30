public class LinearEquation {

    //Instance Variables
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private String cord1;
    private String cord2;

    private boolean vertical;

    //Constructor
    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        cord1 = "("+x1+", "+y1+")";
        cord2 = "("+x2+", "+y2+")";
    }

    // distance() uses the pythagorean theorem to calculate the distance between the two coordinates.
    public double distance()
    {
        return roundedToHundredth(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
    }

    //yIntercept() calculates the Y-Intercept by subtracting the slope multiplied by x1 from y1.
    public double yIntercept()
    {
        return roundedToHundredth(y1-slope()*x1);
    }

    //slope() calculates the slope between the two given coordinates.
    public double slope()
    {
        return roundedToHundredth((double)(y2-y1)/(x2-x1));
    }

    public String equation()
    {
        int deltaY=Math.abs(y2-y1);         //Set deltaY to the absolute value of the difference between y1 and y2.
        int deltaX=Math.abs(x2-x1);         //Set deltaX to the absolute value of the difference between x2 and y1.
        String returnString="y = ";         //First puts y = at the front of the equation.
        if (y1==y2){return returnString+=y1;}           //If the line is horizontal then concatenate y1.
        if(slope()<0) {returnString += " -";}           //if the slope is negative concatenate the negative sign.
        if(slope()==1 || slope()==-1){returnString+="x";}           //If the slope is 1 or -1 only concatenate x.
         else if(deltaY%deltaX==0){returnString += Math.abs(slope())+"x";} else {returnString+= deltaY+"/"+deltaX;}         //If the slope can be simplified use the value from slope() as the coefficient of x; If not use fractions.
        if (yIntercept() > 0){returnString+=" + "+yIntercept();} else if (yIntercept()<0) {returnString+=" - "+Math.abs(yIntercept());}         //Only attaches the y-intercept if it is not 0.
        return returnString;        //Return the concatenated String
    }

    //coordinateForX() calculates the Y value by substituting the xValue into the linear equation.
    // The result is then rounded to the nearest hundredth and returned in coordinate form.
    public String coordinateForX(double xValue){
        return "("+xValue+", "+roundedToHundredth(xValue*slope()+yIntercept())+")";
    }

    //Rounds the parameter inputted to the nearest hundredth.
    public double roundedToHundredth(double toRound){
        return Math.round(toRound*100.0)/100.0;
    }

    //Returns a String that contains the equation, the two coordinates, the slope, the y-intercept, and the distance between the two points.
    public String lineInfo(){
        return "The two points are: " +cord1+" and "+cord2+"\nThe equation of the line between these points is: "+equation()+"\nThe slope of this line is: "+slope()+"\nThe y-intercept of this line is: "+yIntercept()+"\nThe distance between the two points is: "+distance();
    }
}
