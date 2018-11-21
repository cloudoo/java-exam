package com.cloudo.study.file;

import java.io.*;

/**
 * Created by cloudpj on 18/11/21.
 */
public class FileOperator {

    public void read(String fileName){

        BufferedReader reader = null;
        try{
            String temp = null;
            reader = new BufferedReader(new FileReader(fileName));

            while((temp = reader.readLine())!=null){
                System.out.println(temp);
            }

        }catch (Exception e){

            e.printStackTrace();
        }finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void write(String fileName,String text)   {

        BufferedWriter bw = null;
        File file = new File(fileName);

        try{
            if(!file.exists()){
                file.createNewFile();
            }
            bw = new BufferedWriter(new FileWriter(file));

            bw.write(text);

        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }

    public static void main(String[] args) {
        String fileName = "/Users/cloudpj/git/data/datingTestSet.txt";
        String wFileName = "/Users/cloudpj/git/data/leisy.txt";
        FileOperator fileOperator = new FileOperator();
        fileOperator.read(fileName);

        String text = "睡觉哦发觉我饿风景就哦文件佛教我发哦我饥饿佛教我房间我f";
        fileOperator.write(wFileName,text);

    }
}
