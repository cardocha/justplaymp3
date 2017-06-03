package Entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Music
  implements Serializable
{
  String Nome;
  String Autor;
  String Album;
  String data;
  Long tempo;
  String direitos;
  String comentario;
  String path;
  
  public String getPath()
  {
    return path;
  }
  
  public void setPath(String path) {
    this.path = path;
  }
  
  public Music(String Nome, String Autor, String Album, String data, Long tempo, String direitos, String comentario, String path) {
    this.Nome = Nome;
    this.Autor = Autor;
    this.Album = Album;
    this.data = data;
    this.tempo = tempo;
    this.direitos = direitos;
    this.comentario = comentario;
  }
  
  public Music() {}
  
  public String getNome()
  {
    return Nome;
  }
  
  public void setNome(String Nome) {
    this.Nome = Nome;
  }
  
  public String getAutor() {
    return Autor;
  }
  
  public void setAutor(String Autor) {
    this.Autor = Autor;
  }
  
  public String getAlbum() {
    return Album;
  }
  
  public void setAlbum(String Album) {
    this.Album = Album;
  }
  
  public String getData() {
    return data;
  }
  
  public void setData(String data) {
    this.data = data;
  }
  
  public Long getTempo() {
    return tempo;
  }
  
  public void setTempo(Long tempo) {
    this.tempo = tempo;
  }
  
  public String getDireitos() {
    return direitos;
  }
  
  public void setDireitos(String direitos) {
    this.direitos = direitos;
  }
  
  public String getComentario() {
    return comentario;
  }
  
  public void setComentario(String comentario) {
    this.comentario = comentario;
  }
  
  public String toString()
  {
    return "Musica{Nome=" + Nome + ", Autor=" + Autor + ", Album=" + Album + ", data=" + data + ", tempo=" + tempo + ", direitos=" + direitos + ", comentario=" + comentario + '}';
  }
  


  public void serializaListaMusicas(ArrayList<Music> listaMusicas, String arquivo)
  {
    FileOutputStream arq = null;
    ObjectOutputStream out = null;
    try
    {
      arq = new FileOutputStream(arquivo);
      

      out = new ObjectOutputStream(arq);
      

      out.writeObject(listaMusicas); return;
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    } finally {
      try {
        arq.close();
        out.close();
      } catch (IOException ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
  
  public ArrayList<Music> deserializaListaMusicas(String arquivo)
  {
    FileInputStream arqLeitura = null;
    ObjectInputStream in = null;
    ArrayList lista = new ArrayList();
    try
    {
      arqLeitura = new FileInputStream(arquivo);
      

      in = new ObjectInputStream(arqLeitura);
      

      return (ArrayList)in.readObject();
    } catch (ClassNotFoundException|IOException ex) {
      System.out.println(ex.getMessage());
    } finally {
      try {
        arqLeitura.close();
        in.close();
      } catch (IOException ex) {
        System.out.println(ex.getMessage());
      }
    }
    return null;
  }
}
