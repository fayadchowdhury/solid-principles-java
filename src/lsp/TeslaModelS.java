package lsp;

public class TeslaModelS extends Vehicle{
    @Override
    public boolean move() {
        System.out.println(getClass() + " moving");
        return true;
    }
}
