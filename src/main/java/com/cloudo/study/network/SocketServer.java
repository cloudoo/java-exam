package com.cloudo.study.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * 参考 https://www.cnblogs.com/rocomp/p/4790340.html
 *
 */
public class SocketServer {

    private ServerSocket serverSocket;
    private static int SERVER_PORT = 10086;


    public void run() {
        Socket socket = null;
        InputStream inputStream = null;
        InputStreamReader isr = null;
        BufferedReader bufferedReader = null;
        OutputStream os = null;
        OutputStreamWriter osw = null;

        try {
            serverSocket = new ServerSocket(SERVER_PORT);


            System.out.println("服务启动完成");
            int count = 0;
            while (true) {
                System.out.println("等待客户端请求");
                socket = serverSocket.accept();
                System.out.println("客户端建立连接....");

                Thread socketThread = new Thread(new SocketThread(socket));
                socketThread.setPriority(4);
                socketThread.start();
                count++;
                System.out.println("客户端连接数："+count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SocketServer socketServer = new SocketServer();
        socketServer.run();
    }
}
