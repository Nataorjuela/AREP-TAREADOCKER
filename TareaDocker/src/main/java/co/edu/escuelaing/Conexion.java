package co.edu.escuelaing;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.plaf.metal.MetalMenuBarUI;
import java.util.ArrayList;
import java.util.Date;


public class Conexion {

    MongoClientURI uri;
    MongoClient mongoCliente;

    public Conexion() {
        uri=new MongoClientURI("mongodb+srv://nata:nata123@cache.i0hb4xz.mongodb.net/Cache?retryWrites=true&w=majority");
        mongoCliente=new MongoClient(uri);
    }

    public void insertarMsj(Mensaje mensaje){
        MongoDatabase db =mongoCliente.getDatabase("Cache");
        MongoCollection<Document> collection=db.getCollection("msj");
        Document document=new Document();
        document.put("mensaje",mensaje.getMensaje());
        document.put("fecha",mensaje.getFecha());
        collection.insertOne(document);

    }

    public ArrayList<Mensaje> getMsjs(){
        MongoDatabase db =mongoCliente.getDatabase("Cache");
        MongoCollection<Document> collection=db.getCollection("msj");
        FindIterable findIterable=collection.find();
        ArrayList<Document> listDocument=new ArrayList<Document>();
        ArrayList<Mensaje> listMsj =new ArrayList<Mensaje>();
        findIterable.into(listDocument);
        for (Document doc : listDocument){
            if(doc.get("mensaje")!=null && doc.get("fecha")!=null){
                listMsj.add(new Mensaje((String) doc.get("mensaje"),(Date) doc.get("fecha")));
            }
        }
        return listMsj;
    }

}
