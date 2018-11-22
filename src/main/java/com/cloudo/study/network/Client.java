package com.cloudo.study.network;

import java.io.*;
import java.net.Socket;

public class Client {

    public void connTest() {
        Socket socket = null;
        OutputStream os = null;
        OutputStreamWriter osw = null;
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            socket = new Socket("localhost", 10086);
            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            osw.write("im's test message");
            osw.flush();
            socket.shutdownOutput();

            //
            is = socket.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println("服务端说：" + line);
            }




        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
//                br.close();
//                isr.close();
//                is.close();
//                osw.close();
//                os.close();
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        Client client = new Client();
        while (true) {
            client.connTest();
        }

    }
}
