package com;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.retrofit.GraphWalkerClient;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * This class implements simple Digikala Model-based testing
 *
 * @author Bahareh Mohajer
 * @version 1.0.0
 * @since 2020 -09-20
 */
public class MainClass {

    /**
     * This method is main executable method of this class
     * steps:
     * 1- create an object of GraphWalkerClient
     * 2- create an object of DigiKalaTestClass
     * 3 -call has next service and while graph has next node or edge do:
     * 3-1- call next service to get name of next method
     * 3-2- invoke method of DigiKalaTestClass class by name
     * 3-3- call get data service and print data
     * 4- call getStatistics service and print json type of result
     *
     * @param args the input arguments
     * @throws IOException               the io exception
     * @throws ClassNotFoundException    the class not found exception
     * @throws NoSuchMethodException     the no such method exception
     * @throws IllegalAccessException    the illegal access exception
     * @throws InstantiationException    the instantiation exception
     * @throws InvocationTargetException the invocation target exception
     * @throws InterruptedException      the interrupted exception
     * @author Bahareh Mohajer
     * @version 1.0.0
     * @see ClassNotFoundException
     * @see NoSuchMethodException
     * @see IllegalAccessException
     * @see InstantiationException
     * @see InvocationTargetException
     * @see InterruptedException
     * @since 2020 -09-20
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, InterruptedException {
        GraphWalkerClient gwclient=new GraphWalkerClient();
        Class<?> c = Class.forName("com.digikala.DigiKalaTestClass");
        Object digiKalaTestClass = c.newInstance();


            while (gwclient.hasNext()){
                String methodName = gwclient.getNext();
                Method method=digiKalaTestClass.getClass().getMethod(methodName);
                method.invoke(digiKalaTestClass);
                System.out.println(gwclient.getData());

            }




        System.out.println("_________________________________________finish_______________________________________");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(gson.toJson(gwclient.getStatistics()));
        String prettyJsonString = gson.toJson(je);

        System.out.println(prettyJsonString);
        gwclient.restart();



    }
}
