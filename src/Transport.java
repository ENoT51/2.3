public abstract class Transport implements Vehicle {
    private String modelName;
    private int wheelsCount;



    public Transport(String modelName, int wheelsTyre){
        this.modelName = modelName;
        this.wheelsCount = wheelsTyre;

    }
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
