package auto
import java.awt.Rectangle
import java.awt.Robot
import java.awt.image._
import java.awt.AWTException
import java.io._
import javax.imageio._
import java.text._
import java.util.Date

class Util {
	val format:SimpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmm");

	def caputureSS(path:String):Unit= {
		try {
			val bounds:Rectangle = new Rectangle(0, 0, 1280, 800);
			val robot:Robot  = new Robot();
			val image:BufferedImage  = robot.createScreenCapture(bounds);

			// ˆÈ‰ºAo—Íˆ—
			val dirName:String  = path;
			val fileName = "test_" + format.format(new Date()) + ".jpg";
			ImageIO.write(image, "jpg", new File(dirName, fileName));
		} catch {
		    case e:AWTException  => e.printStackTrace()
		    case e:IOException   => e.printStackTrace()
		} 
	}
}