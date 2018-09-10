/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosh;

import com.github.sarxos.webcam.Webcam;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WebCamCapture {

    public static void main(String[] args) throws IOException {
        File file = new File("captureImg.PNG");
        
        Webcam webCam = Webcam.getDefault();
        webCam.open();
        
        ImageIO.write(webCam.getImage(), "PNG", file);
    }
    
}
