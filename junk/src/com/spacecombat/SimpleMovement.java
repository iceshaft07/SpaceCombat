package com.spacecombat;

public class SimpleMovement extends Component 
{
	private float speedX = 0;
	private float speedY = 0;
	private float speedZ = 0;
	
	private RigidBody rigidBody;
		
	public void setSpeed (Vector3 speed)
	{
		speedX = speed.x;		
		speedY = speed.y;		
		speedZ = speed.z;		
	}
	
	public void update ()
	{
		if (rigidBody == null)
		{
			rigidBody = gameObject.getRigidBody();
			return;
		}
		
		rigidBody.speed.x = speedX;
		rigidBody.speed.y = speedY;
		rigidBody.speed.z = speedZ;
	}
}
