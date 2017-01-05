
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

class ShapeFactory /*Can be package-private*/
{
    public Shape shape;
    public BasicStroke stroke = new BasicStroke(3.0f);
    public Paint paint;
    public final int width = 25;/*Declaration can have final modifier*/
    public final int height = 25;/*Declaration can have final modifier*/

    public ShapeFactory() /*возможность выбора фигур*/ {
        int shape_type;/*Parameter can be converted to a local variable*/
        switch (shape_type = 9) {
            case 1: {
                this.shape = ShapeFactory.createStar(3, new Point(0, 0), (double) this.width / 2.0, (double) this.width / 2.0);
                break;
            }
            case 3: {
                this.shape = ShapeFactory.createStar(5, new Point(0, 0), (double) this.width / 2.0, (double) this.width / 4.0);
                break;
            }
            case 5: {
                this.shape = new Rectangle2D.Double((double) (-this.width) / 2.0, (double) (-this.height) / 2.0, this.width, this.height);
                break;
            }
            case 7: {
                GeneralPath path = new GeneralPath();
                double tmp_height = Math.sqrt(2.0) / 2.0 * (double) this.height;
                path.moveTo((double) ((-this.width) / 2), -tmp_height);
                path.lineTo(0.0, -tmp_height);
                path.lineTo((double) (this.width / 2), tmp_height);
                path.closePath();
                this.shape = path;
                break;
            }
            case 9: {
                this.shape = new Arc2D.Double((double) (-this.width) / 2.0, (double) (-this.height) / 2.0, this.width, this.height, 30.0, 300.0, 2);
                break;
            }
            default: {
                throw new Error("type is nusupported");/*Added to dictionary*/
            }
        }
        switch (shape_type = 7) {
            case 1: {
                this.stroke = new BasicStroke(3.0f);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                this.stroke = new BasicStroke(7.0f);
                break;
            }
            case 7: {
                this.paint = new GradientPaint(-this.width, -this.height, Color.white, this.width, this.height, Color.gray, true);
                break;
            }
            case 8: {
                this.paint = Color.red;
                break;
            }
            default: {
                throw new Error("type is nusupported");/*Added to dictionary*/
            }
        }
    }

    private static Shape createStar(int arms, Point center, double rOuter, double rInner) /*настройка расположения фигур*/ {
        double angle = 3.141592653589793 / (double) arms;
        GeneralPath path = new GeneralPath();
        int i = 0;
        while (i < 2 * arms) {
            double r = (i & 1) == 0 ? rOuter : rInner;
            Point2D.Double p = new Point2D.Double((double) center.x + Math.cos((double) i * angle) * r, (double) center.y + Math.sin((double) i * angle) * r);
            if (i == 0) {
                path.moveTo(p.getX(), p.getY());
            } else {
                path.lineTo(p.getX(), p.getY());
            }
            ++i;
        }
        path.closePath();
        return path;
    }
}

