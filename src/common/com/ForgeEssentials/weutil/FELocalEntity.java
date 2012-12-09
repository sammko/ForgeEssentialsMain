package com.ForgeEssentials.weutil;

import net.minecraft.src.Entity;

import com.sk89q.worldedit.Location;
import com.sk89q.worldedit.Vector;

public class FELocalEntity extends com.sk89q.worldedit.LocalEntity {
	protected final Entity entity;

	public FELocalEntity(Entity entity) {
		super(new Location(ModuleWECompat.instance.getWorld(entity.worldObj), new Vector(entity.posX, entity.posY, entity.posZ), entity.rotationYaw, entity.rotationPitch));

		this.entity = entity;
	}

	@Override
	public boolean spawn(Location arg0) {
		Vector pos = arg0.getPosition();
		entity.setPositionAndRotation(pos.getX(), pos.getY(), pos.getZ(), arg0.getYaw(), arg0.getPitch());
		entity.worldObj.spawnEntityInWorld(entity);
		return true;
	}
}