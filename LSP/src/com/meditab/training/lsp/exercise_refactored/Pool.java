package com.meditab.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck);
        swim(electricDuck);
    }

    private void quack(General g)
    {
        g.quack();
    }

    private void swim(General g)
    {
    	g.swim();
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}