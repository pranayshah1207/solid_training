package com.meditab.training.ocp.exercise;

public class SpaceSlot
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceType resourceType) implements resource
    {
        int resourceId;
        
        if(resourceType==SPACE_SLOT)
        {
        	
            resourceId = findFreeSpaceSlot();
            markSpaceSlotBusy(resourceId);
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

       if(resourceType==SPACE_SLOT)
       {
           markSpaceSlotFree(resourceId);
       }

       else
       {
           System.out.println("ERROR: attempted to free invalid resource");
       }
    }

    private void markSpaceSlotFree(int resourceId)
    {
    }

   
    private void markSpaceSlotBusy(int resourceId)
    {
    }

    private int findFreeSpaceSlot()
    {
        return 0;
    }

  
}
