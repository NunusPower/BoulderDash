package Modele;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Diamond extends ElementsAffichables
{
	public Diamond() 
	{
		super (true, true, true);
	}

	@Override
	public BufferedImage construireEA() {
		try 
		{
			this.loadSpriteSheet("diamond.gif");
		}
	
		catch ( IOException e ) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedImage sprite;
	
		sprite = this.getSprite(0, 0, 16, 16);
		
		//sprites.add(vr.getSprite(31, 31, 16, 16));
		return sprite;
	}

}
