public class FanClass {
    public FanClass(){
    }
    final int slow =1;
    final int medium=2;
    final int fast=3;
    private int speed=slow;
    private boolean on=false;
    private double radius=5.0;
    private String color="blue";
    public int getSpeed()
    {
        return this.speed;
    }
    public boolean onOff()
    {
        return this.on;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setSpeed(int speed)
    {
        this.speed=speed;
    }
    public void setOnOff(boolean a)
    {
        this.on=a;
    }
    public void setRadius( double radius)
    {
        this.radius=radius;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String toString()
    {
        if(this.onOff())
        {
            return ("fan is on with speed of " +this.getSpeed()+", color of "+this.getColor()+", radius of "+this.getRadius());
        }
        return ("fan is off with speed of " +this.getSpeed()+", color of "+this.getColor()+", radius of "+this.getRadius());
    }



}
