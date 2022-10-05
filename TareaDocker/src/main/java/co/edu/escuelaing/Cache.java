package co.edu.escuelaing;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;

import static spark.Spark.*;

public class Cache

{
    public static void main( String[] args )
    {
       //Mensaje mensaje=new Mensaje("primer intento",new Date());
        Conexion conexion=new Conexion();
        //conexion.insertarMsj(mensaje);
       ArrayList<Mensaje> listMsj =conexion.getMsjs();
        System.out.println(listMsj.get(0).getMensaje());


        staticFileLocation("/static");
        port(getPort());
        get("/",(req,res)->{
           res.redirect("index.html");
           return null;
       });
        get("listMsj",(req,res)->{
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(conexion.getMsjs());
        });

        post("insertMsj",(req,res)->{
            res.status(200);
            Mensaje msj=new Mensaje(req.body(),new Date());
            conexion.insertarMsj(msj);
            return "SI INSERTA";
        });
    }

    private static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }


}
