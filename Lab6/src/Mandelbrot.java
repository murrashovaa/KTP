import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {

    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        // â ñîîòâåòñòâèè ñ íà÷àëüíûì äèàïàçîíîì â (-2 - 1.5i) - (1 + 1.5i):
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    // Êîíñòàíòà
    public static final int MAX_ITERATIONS = 2000;

    public int numIterations(double x, double y) {

        int iterCounter = 0;
        double real = 0;
        double img= 0;
        double zMod = 0; // ìîäóëü êîìïëåêñíîãî ÷èñëà äîëæåí íå ïðåâûøàòü 2
        // zn = z(n-1)^2 + c = (real + image)^2 + c = real^2 + 2real*image -image^2 + c
        while(iterCounter < MAX_ITERATIONS && zMod < 4) {
            iterCounter++;
            double nextReal = real * real - img * img + x;
            double nextImg = 2 * real * img + y;
            zMod = nextImg * nextImg + nextReal * nextReal;
            real = nextReal;
            img = nextImg;
        }
        return iterCounter < MAX_ITERATIONS ? iterCounter : -1;
    }
    public String toString() { return "Mandelbrot"; }
}