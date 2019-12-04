public class ExecutingSpy {
    public static void main(String[] args)
    {
        Spy agent = new Spy(); // creating class instance

        agent.set_Name("B!ake"); // setting name of an agent
        agent.set_realName("Vladimir"); // setting real name of an agent
        agent.set_squad(7); // setting squad of an agent

        agent.print(); // printing all information about the spy
    }
}
