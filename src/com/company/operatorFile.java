package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class operatorFile {
    String user;
    public void setUser(String user) {
        this.user = user;
    }
    public operatorFile(String user) {
        this.user = user;
    }
    public operatorFile() { }
    public ArrayList<String> getUserMess(int index){
        ArrayList<String> temp=new ArrayList<String>();
        File file=new File("user.txt");
        String line="";
        try{
            BufferedReader br=new BufferedReader(new FileReader(file));
            while ((line = br.readLine())!=null && line!="\n"){
                temp.clear();
                StringTokenizer sk=new StringTokenizer(line);
                while (sk.hasMoreTokens()) {
                    temp.add(sk.nextToken());
                }
                if (temp.get(index).equals(this.user))  break;
            }
        }
        catch(IOException e){}
        return (line==null)?new ArrayList<String>():temp;
    }
    public void writeUserMess(User u){
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(new File("user.txt"),true));
            bw.write(u.toString()+"\n");
            bw.close();
        }
        catch (IOException e){ }
    }
}
