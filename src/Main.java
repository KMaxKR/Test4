public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        Cpu.Processor processor = cpu.new Processor();
        Cpu.RAM ram = cpu.new RAM();

        MotherBoard motherBoard = new MotherBoard();

        System.out.println(processor.getProcessor());
        System.out.println(ram.getRam());
        System.out.println(motherBoard.getUSB());
    }
}