public class Wall {
    double height;
    double width;

    public void checkWidth(double width){
        if(width < 0){
            this.width=0;
        }else{
            this.width=width;
        }
    }
    public void checkHeight(double height){
        if(height < 0){
            this.height=0;
        }else{
            this.height=height;
        }
    }

    public Wall(double height, double width){
        checkHeight(height);
        checkWidth(width);
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        checkWidth(width);
    }

    public void setHeight(double height){
        checkHeight(height);
    }
    public double getArea(){
        return height*width;
    }
}
