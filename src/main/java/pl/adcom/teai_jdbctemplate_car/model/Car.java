package pl.adcom.teai_jdbctemplate_car.model;

public class Car {

    private long carId;
    private String mark;
    private String model;
    private Color color;
    private int productionDate;

    public Car() {
    }

    public Car(String mark, String model, Color color, int productionDate) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.productionDate = productionDate;
    }

    public Car(long carId, String mark, String model, Color color, int productionDate) {
        this.carId = carId;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.productionDate = productionDate;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", productionDate=" + productionDate +
                '}';
    }
}