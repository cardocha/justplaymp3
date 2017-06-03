package ModeloTabelas;

import Entidades.Musica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.AbstractTableModel;



public class ModeloMusicas
  extends AbstractTableModel
{
  private final String[] colunas = { "Nome", "Autor", "Album" };
  

  private ArrayList<Musica> linhas;
  


  public ModeloMusicas()
  {
    linhas = new ArrayList();
  }
  
  public ModeloMusicas(ArrayList<Musica> linhas) {
    this.linhas = linhas;
  }
  

  public int getRowCount()
  {
    return linhas.size();
  }
  
  public int getColumnCount()
  {
    return colunas.length;
  }
  
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    Musica m = (Musica)linhas.get(rowIndex);
    switch (columnIndex) {
    case 0: 
      return m.getNome();
    case 1: 
      return m.getAutor();
    case 2: 
      return m.getAlbum();
    }
    
    
    return null;
  }
  

  public void setValueAt(Object objetct, int rowIndex, int columnIndex)
  {
    Musica m = (Musica)linhas.get(rowIndex);
    String value = (String)objetct;
    switch (columnIndex) {
    case 0: 
      m.setNome(value);
      break;
    case 1: 
      m.setAutor(value);
      break;
    case 2: 
      m.setAlbum(value);
      break;
    }
    
    

    fireTableRowsInserted(rowIndex, rowIndex);
  }
  


  public String getColumnName(int column)
  {
    return colunas[column];
  }
  

  public Class<?> getColumnClass(int columnIndex)
  {
    switch (columnIndex) {
    case 0: 
      return String.class;
    case 1: 
      return String.class;
    case 2: 
      return String.class;
    }
    
    return null;
  }
  

  public void limpar()
  {
    linhas.clear();
    

    fireTableDataChanged();
  }
  
  public void addListaDeMusicas(List<Musica> musicas)
  {
    int indice = getRowCount();
    

    linhas.addAll(musicas);
    

    fireTableRowsInserted(indice, indice + musicas.size());
  }
  
  public Musica getMusica(int rowIndex)
  {
    return (Musica)linhas.get(rowIndex);
  }
  
  public void addMusica(Musica musica)
  {
    linhas.add(musica);
    



    int ultimoIndice = getRowCount() - 1;
    

    fireTableRowsInserted(ultimoIndice, ultimoIndice);
  }
  

  public void removeMusica(int indiceLinha)
  {
    linhas.remove(indiceLinha);
    

    fireTableRowsDeleted(indiceLinha, indiceLinha);
  }
  
  public ArrayList<Musica> getAsArrayList() {
    return linhas;
  }
  
  public void mistura() {
    Collections.shuffle(linhas);
    


    fireTableRowsUpdated(0, linhas.size() - 1);
  }
}
