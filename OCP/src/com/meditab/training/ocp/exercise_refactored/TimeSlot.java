package com.meditab.training.ocp.exercise;

public class TimeSlot
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceType resourceType) implements resource
    {
        int resourceId;
        if(resourceType==TIME_SLOT)
        {
            resourceId = findFreeTimeSlot();
            markTimeSlotBusy(resourceId);
        }


        else
        {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
        }

        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId) implements resource
    {
    	if(resourceType==TIME_SLOT)
    	{
            markTimeSlotFree(resourceId);
    	}

        else
            {
                System.out.println("ERROR: attempted to free invalid resource");
            }

    }


    private void markTimeSlotFree(int resourceId)
    {
    }


    private void markTimeSlotBusy(int resourceId)
    {
    }

    private int findFreeTimeSlot()
    {
        return 0;
    }
}
