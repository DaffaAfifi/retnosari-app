package modelchart;

public class chartmodel {

    public chartmodel(String senin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double[] getValues() {
        return values;
    }

    public void setValues(double[] values) {
        this.values = values;
    }

    public chartmodel(String label, double[] values) {
        this.label = label;
        this.values = values;
    }

    public chartmodel() {
    }

    private String label;
    private double values[];

    public double getMaxValues() {
        double max = 0;
        for (double v : values) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
}