package com.ForgeEssentials.data.nbt;

import com.ForgeEssentials.data.DataDriver;
import com.ForgeEssentials.data.TaggedClass.SavedField;

public class NBTDataAdapter<SavedType> extends DataAdapter<SavedType>
{

	public NBTDataAdapter(DataDriver driver, Class<SavedType> type)
	{
		super(driver, type);
		// TODO Auto-generated constructor stub
	}
	/*private String dataDir;
	
	public NBTDataAdapter()
	{
		this.dataDir = ((NBTDataDriver)DataDriver.getInstance()).getBaseBath() + "PlayerInfo/";
		File f = new File(dataDir);
		
		// Ensure the PlayerInfo directory exists.
		if (!f.exists())
		{
			try
			{
				// Attempt to create this and any parent folders.
				f.mkdirs();
			}
			catch (Exception e)
			{
				OutputHandler.SOP("Error while creating Playerinfodirectory");
			}
		}
	}
	@Override
	public boolean saveData(PlayerInfo object)
	{
		boolean flag = true;

		File file = new File(this.dataDir + object.getUsername().toLowerCase()+".dat");
		NBTTagCompound nbtTag = new NBTTagCompound();
		nbtTag.setName(object.getUsername());
	
		NBTTagCompound wand = new NBTTagCompound();
		wand.setName("wand");
		wand.setInteger("id", object.wandID);
		wand.setInteger("meta", object.wandDmg);
		wand.setBoolean("enabled", object.wandEnabled);
		nbtTag.setCompoundTag("wand", wand);
		NBTTagCompound selection = new NBTTagCompound();
		selection.setName("selection");
		if(object.getPoint1() != null) {
			selection.removeTag("1");
			selection.setInteger("x1", object.getPoint1().x);
			selection.setInteger("y1", object.getPoint1().y);
			selection.setInteger("z1", object.getPoint1().z);
		} else {
			selection.setBoolean("1", false);
		}
		if(object.getPoint2() != null) {
			selection.removeTag("2");
			selection.setInteger("x2", object.getPoint2().x);
			selection.setInteger("y2", object.getPoint2().y);
			selection.setInteger("z2", object.getPoint2().z);
		} else {
			selection.setBoolean("2", false);
		}
		nbtTag.setCompoundTag("selection", selection);
		NBTTagCompound home = new NBTTagCompound();
		home.setName("home");
		if(object.home != null) {
			selection.removeTag("none");
			home.setInteger("x", object.home.x);
			home.setInteger("y", object.home.y);
			home.setInteger("z", object.home.z);
			home.setInteger("dim", object.home.z);
		} else {
			home.setBoolean("none", true);
		}
		nbtTag.setCompoundTag("home", home);
		NBTTagCompound death = new NBTTagCompound();
		death.setName("death");
		if(object.lastDeath != null) {
			death.setInteger("x", object.lastDeath.x);
			death.setInteger("y", object.lastDeath.y);
			death.setInteger("z", object.lastDeath.z);
			death.setInteger("dim", object.lastDeath.dim);
		} else {
			death.setBoolean("none", true);
		}
		nbtTag.setCompoundTag("death",death);
		nbtTag.setInteger("spawnType", object.spawnType);
		
		
		try {
			CompressedStreamTools.writeCompressed(nbtTag, new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			flag = false;
			OutputHandler.SOP("NBTfile for player "+object.getUsername() + " was not found");
		} catch (IOException e) {
			flag = false;
			OutputHandler.SOP("IOError while writing the NBTfile for player" + object.getUsername());

		} catch (Exception e) {
			flag = false;
			OutputHandler.SOP("Error while writing the NBTfile for player" + object.getUsername());
		}
		
		return flag;
	}

	@Override
	public boolean loadData(String username, PlayerInfo object)
	{
		boolean flag = true;

		File file = new File(this.dataDir + username.toLowerCase()+".dat");
		NBTTagCompound nbtTag;
		try {
			nbtTag = CompressedStreamTools.readCompressed(new FileInputStream(file));
			NBTTagCompound wand = nbtTag.getCompoundTag("wand");
			object.wandID = wand.getInteger("id");
			object.wandDmg = wand.getInteger("meta");
			object.wandEnabled = wand.getBoolean("enabled");
			NBTTagCompound selection = nbtTag.getCompoundTag("selection");
			if(!selection.hasKey("1")) {
				object.setPoint1(new Point(selection.getInteger("x1"), selection.getInteger("y1"), selection.getInteger("z1")));
			}
			if(!selection.hasKey("2")) {
				object.setPoint2(new Point(selection.getInteger("x2"), selection.getInteger("y2"), selection.getInteger("z2")));
			}
			NBTTagCompound home = nbtTag.getCompoundTag("home");
			if(!home.hasKey("none")) {
				object.home.x = home.getInteger("x");
				object.home.y = home.getInteger("y");
				object.home.z = home.getInteger("z");
				object.home.dim = home.getInteger("dim");
			}
			NBTTagCompound death = nbtTag.getCompoundTag("death");
			if(!home.hasKey("none")) {
				object.lastDeath.x = death.getInteger("x");
				object.lastDeath.y = death.getInteger("y");
				object.lastDeath.z = death.getInteger("z");
				object.lastDeath.dim = death.getInteger("dim");
			}
			object.spawnType = nbtTag.getInteger("spawnType");
		} catch (FileNotFoundException e) {
			// I think this error can be empty because it only should be called if there is no file for the player which means he visits the server for first time since FE is installed
		} catch (IOException e) {
			flag = false;
			OutputHandler.SOP("IOError while reading the NBTfile for player" + object.getUsername());
		} catch (Exception e) {
			flag = false;
			OutputHandler.SOP("Error while reading the NBTfile for player" + object.getUsername());
		}
		return flag;
	}

	@Override
	public boolean deleteData(String username)
	{
		File file = new File(this.dataDir + username.toLowerCase()+".dat");
		file.delete();
		
		return file.exists() ? false : true;
	}*/
	@Override
	public SavedField[] loadData(Object uniqueObjectKey)
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SavedField[][] loadAll()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteData(Object uniqueObjectKey)
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean saveData(SavedType object)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
