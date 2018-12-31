package com.meditab.training.lsp.exercise;

public class ElectronicDuck extends General
{
    private boolean _on = false;

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }

	public void quack() {
		// TODO Auto-generated method stub
		 if (_on) {
	            System.out.println("Electronic duck quack...");
	        } else {
	            throw new RuntimeException("Can't quack when off");
	        }
	}

	public void swim() {
		// TODO Auto-generated method stub
		 if (_on) {
	            System.out.println("Electronic duck swim");
	        } else {
	            throw new RuntimeException("Can't swim when off");
	        }
	}
}
