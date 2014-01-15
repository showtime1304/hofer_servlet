package servlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class main
 */
@WebServlet("/main")
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BufferedImage img = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
		
		//Random für Zufällige Farben/Formen.
		Random rand = new Random(); 
	    int nr1 = rand.nextInt(6);
	    int nr2 = rand.nextInt(3);
   
		Graphics g = img.createGraphics();
		
		//Switch für Farbe (S.o.p war nur zum Testen, da Anfangs kleinen Denkfehler)
		switch(nr1){
		case 0:
			System.out.println(nr2 +"yellow");
			g.setColor(Color.yellow);
			break;
		case 1:
			System.out.println(nr2 +"blue");
			g.setColor(Color.blue);
			break;
		case 2:
			System.out.println(nr2 +"green");
			g.setColor(Color.green);
			break;
		case 3:
			System.out.println(nr2 +"orange");
			g.setColor(Color.orange);
			break;
		case 4:
			System.out.println(nr2 +"pink");
			g.setColor(Color.pink);
			break;
		case 5:
			System.out.println(nr2 +"red");
			g.setColor(Color.red);
			break;
		}
		
		//Switch für Form (ebenfalls s.o.p zum testen, siehe oben!)
		switch (nr2){
		case 0:
			System.out.println(nr1 +"arc");
			g.fillArc(100, 100, 100, 100, 50, 50);
			break;
		case 1:
			System.out.println(nr1 +"oval");
			g.fillOval(100, 100, 100, 100);
			break;
		case 2:
			System.out.println(nr1 +"rect");
			g.fillRect(100, 100, 100, 100);
			break;
		}
		
		//Gibt Ressourcen vom Bild frei
		g.dispose();

		//Gibt Bild in Output Stream und wird dargestellt!
		ImageIO.write(img, "jpg", response.getOutputStream()); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
