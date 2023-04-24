import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends JComponent {
    // êëàññ bufferedImage óïðàâëÿåò îòðèñîâûâàåìûì èçîáðàæåíèåì
    private BufferedImage showImage;
    // êîíñòðóêòîð ñîçäàþùèé îáúåêò BufferedImage ñ çàäàíîé øèðèíîé è âûñîòîé
    public JImageDisplay(int width, int height) {
        this.showImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        super.setPreferredSize(new Dimension(width, height));
    }

    public BufferedImage getImage() {
        return showImage;
    }

    protected void paintComponent(Graphics g) { //ïåðåîïðåäåëåíèå ìåòîäà, âûçîâ èçîáðàæåíèÿ íà ýêðàí
        super.paintComponent(g);
        g.drawImage(showImage, 0, 0, showImage.getWidth(), showImage.getHeight(), null);
    }

    public void drawPixel(int x, int y, int rgbColor) {
        showImage.setRGB(x, y, rgbColor);
    }

    public void clearImage() {
        for (int i = 0; i < showImage.getHeight(); ++i) {
            for (int j = 0; j < showImage.getWidth(); ++j) {
                drawPixel(i, j, 0);
            }
        }
    }

}