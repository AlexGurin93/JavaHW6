public class noteBook {
    private String name;
    private String ram;
    private String hardDisk;
    private String operatingSystem;
    private String colour;

    public noteBook(String name, String ram, String hardDisk, String operatingSystem, String colour) {
        this.name = name;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }


    public String getOperatingSystem() {
        return operatingSystem;
    }


    public String getColor() {
        return colour;
    }

    @Override
    public String toString() {
        return "noteBook [name=" + name + ", ram=" + ram + ", hardDisk=" + hardDisk + ", operatingSystem="
                + operatingSystem + ", color=" + colour + "]";
    }


}

