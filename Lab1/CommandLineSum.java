class CommandLineSum {
    public static void main(String[] args) {

        

        if (args.length < 3) {
            System.out.print("Please provide three numbers as command line arguments.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int sum = a + b + c;
        System.out.println("Sum = " + sum);
    }
}
