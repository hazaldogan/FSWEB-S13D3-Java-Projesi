public class Wall {
    double height;
    double width;

    public Wall(double height, double width){
        this.height=height;
        this.width=width;
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double setWidth(double width){
        if(width<0){
            return this.width = 0;
        }
        return this.width=width;
    }

    public double setHeight(double height){
        if(height<0){
            return this.height=0;
        }
        return this.height=height;
    }
    public double getArea(){
        return this.height*this.width;
    }
}
