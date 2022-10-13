public class Car {

    private int id;
    private String mark;
    private String model;
    private int date;
    private String color;
    private Long price;
    private String reg_num;

    public Car(int id, String mark, String model, int date, String color, Long price, String reg_num) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.date = date;
        this.color = color;
        this.price = price;
        this.reg_num = reg_num;
    }

    public Car(String mark, String model, int date, String color, Long price, String reg_num) {
        this.mark = mark;
        this.model = model;
        this.date = date;
        this.color = color;
        this.price = price;
        this.reg_num = reg_num;
    }

    public Car() {
    }

    @Override
    public String toString()
    {
        return this.mark + " " + this.model + " " + this.date + " " + this.color + " " + this.price + " " + this.reg_num + " ";
    }

    public static void get_cars_by_mark(Car[] cars, String mark){
        for (Car car : cars)
            if (car.getMark().equals(mark)){
                System.out.println(car);
            }
    }

    public static void get_cars_by_model_and_date(Car[] cars, String model, int years){
        int date = 2022 - years;
        for (Car car : cars)
            if (car.getModel().equals(model) && car.getDate() < date){
                System.out.println(car);
            }
    }

    public static void get_cars_by_date_and_price(Car[] cars, int date, Long price){

        for (Car car : cars)
            if (car.getDate() == date && car.getPrice() > price){
                System.out.println(car);
            }
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getDate() {
        return date;
    }

    public String getColor() {
        return color;
    }

    public Long getPrice() {
        return price;
    }

    public String getReg_num() {
        return reg_num;
    }
}
