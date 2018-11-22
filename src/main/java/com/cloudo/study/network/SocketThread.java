package com.cloudo.study.network;

import java.io.*;
import java.net.Socket;

public class SocketThread implements Runnable {

    private Socket socket = null;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {


        InputStream inputStream = null;
        InputStreamReader isr = null;
        BufferedReader bufferedReader = null;
        OutputStream os = null;
        OutputStreamWriter osw = null;

        try {

            inputStream = socket.getInputStream();
            isr = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(isr);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("客户端发送消息:" + line);
            }
            socket.shutdownInput();
            //输出流
            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            osw.write("你好！！！");
            osw.flush();

            socket.shutdownOutput();


            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
