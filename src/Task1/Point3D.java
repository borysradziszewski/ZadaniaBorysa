package Task1;

public class Point3D extends Point2D{
    float z;


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{x,y,z};
    }
    public void setXYZ(float x, float y, float z){
        this.z=z;
        this.setXY(x,y);
    }

    @Override
    public String toString() {
        return String.format("(%f, %f, %f", x,y,z);
    }
}
