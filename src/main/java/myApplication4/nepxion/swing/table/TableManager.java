package myApplication4.nepxion.swing.table;


import javax.swing.JTable;
import javax.swing.table.TableModel;



public class TableManager
{
	public static void setPreferenceStyle(JTable table)
	{
		// JTableHeader tableHeader = table.getTableHeader();
		// tableHeader.setPreferredSize(new Dimension(tableHeader.getPreferredSize().width, 18));
		// tableHeader.setBackground(UIManager.getColor("Panel.background"));
		// tableHeader.setReorderingAllowed(false);
		
			
			table.setRowHeight(25);
		
	}
	
	public static int getSelectionMode(JTable table)
	{
		return table.getSelectionModel().getSelectionMode();
	}
	
	public static void setSelectionMode(JTable table, int mode)
	{
		table.getSelectionModel().setSelectionMode(mode);
	}
	
	public static ITableModel getModel(JTable table)
	{
		ITableModel model = null;
		
		TableModel tableModel = table.getModel();
		if (tableModel instanceof ITableModel)
		{
			model = (ITableModel) tableModel;
		}
		
		return model;
	} 
}