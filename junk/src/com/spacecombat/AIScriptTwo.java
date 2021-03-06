package com.spacecombat;

public class AIScriptTwo extends AIScript
{

	private RigidBody rigidBody;	
	private Vector3 accel = new Vector3(1,1,0);
	private Vector3 maxSpeed = new Vector3(1,1,0);	
	//private int count = 0;
	//private int maxCount = 120;
	private boolean m_bReverse = false;
	
	private Vector3 maxPosition = new Vector3(480-32,400,0);

	
	public void onCreate ()
	{
		rigidBody = gameObject.getRigidBody();	
	}
	
	public void update ()
	{
		if (rigidBody == null)
		{
			rigidBody = gameObject.getRigidBody();	
		}
		if (!m_bReverse)
		{
			if (gameObject.transform.position.y > maxPosition.y)
			{
				if (rigidBody.speed.x > 0)
				{
					rigidBody.speed.x=0;
				}
				if (rigidBody.speed.y > -maxSpeed.y)
				{
					rigidBody.speed.y=-maxSpeed.y;
				}
			}
			else if (gameObject.transform.position.x < maxPosition.x)
			{
				if (rigidBody.speed.x < maxSpeed.x)
				{
					rigidBody.speed.x=maxSpeed.x;
				}
				if (rigidBody.speed.y < 0)
				{
					rigidBody.speed.y=0;
				}
			}
			else
			{
				if (rigidBody.speed.x > 0)
				{
					rigidBody.speed.x=0;
				}
				if (rigidBody.speed.y > -maxSpeed.y)
				{
					rigidBody.speed.y=-maxSpeed.y;
				}
			}
		}
	}
}
