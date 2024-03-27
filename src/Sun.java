public class Sun {
    private static Sun instance;
    private String name = "Звезда по имени Солнце";
    private Sun(){}

    public static Sun getInstance(){ 
        if(instance == null){		
            instance = new Sun();
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
