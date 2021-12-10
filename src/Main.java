import dip.*;
import lsp.TeslaModelS;
import lsp.Vehicle;
import lsp.VehicleMovementTesterService;
import ocp.EmailNotificationService;
import ocp.NotificationInterface;
import ocp.SMSNotificationService;
import srp.DatabaseConnectionService;
import srp.InvoiceService;
import srp.InvoiceServiceSrp;
import srp.OrderService;

public class Main {

    public static void main(String[] args){
//        SRP
//        InvoiceService invServ = new InvoiceService();
//        invServ.connectToDatabase();
//        invServ.fetchOrders("170041041");
//        invServ.generateInvoice();
//        DatabaseConnectionService dcs = new DatabaseConnectionService();
//        dcs.connectToDatabase();
//        OrderService os = new OrderService();
//        os.fetchOrders("170041041");
//        InvoiceServiceSrp invSerSrp = new InvoiceServiceSrp();
//        invSerSrp.generateInvoice();
//        OCP
//        NotificationInterface ni = new EmailNotificationService();
//        ni.sendNewDeals();
//        ni.sendRestock("Nescafe Gold Coffee");
//        ni = new SMSNotificationService();
//        ni.sendNewDeals();
//        ni.sendRestock("Nescafe Gold Coffee");
//        LSP
//        VehicleMovementTesterService vmts = new VehicleMovementTesterService();
//        vmts.testMovement(new Vehicle());
//        vmts.testMovement(new TeslaModelS());
//        DIP
//        SwitchableApplianceInterface app_;
//        SwitchInterface switch_;
//        // LightBulb and PowerSwitch
//        app_ = new LightBulb();
//        switch_= new PowerSwitch(app_);
//        switch_.press();
//        switch_.press();
//
//        // Fan and PowerSwitch
//        app_ = new Fan();
//        switch_= new PowerSwitch(app_);
//        switch_.press();
//        switch_.press();
//
//        // LightBulb and RemoteSwitch
//        app_ = new LightBulb();
//        switch_= new RemoteSwitch(app_);
//        switch_.press();
//        switch_.press();
//
//        // LightBulb and PowerSwitch
//        app_ = new Fan();
//        switch_= new RemoteSwitch(app_);
//        switch_.press();
//        switch_.press();
    }
}
