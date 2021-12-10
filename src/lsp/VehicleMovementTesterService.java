package lsp;

public class VehicleMovementTesterService {
    public void testMovement(Vehicle v)
    {
        if ( v.move() )
        {
            System.out.println(v.getClass() + " is moving correctly");
        }
    }
}
