public class MotherBoard {
    static class USB{
        private String usb = "Connected";
        public String getUsb(){
            return usb;
        }
    }
    public String getUSB(){
        USB usb = new USB();
        return usb.getUsb();
    }
}
