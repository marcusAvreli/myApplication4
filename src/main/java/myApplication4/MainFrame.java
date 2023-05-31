package myApplication4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import myApplication4.element.ElementNode;
import myApplication4.icon.IconFactory;
import myApplication4.nepxion.swing.table.JBasicTable;
import myApplication4.pagination.PaginationContext;




public class MainFrame extends JFrame{
	private static final Logger logger = LoggerFactory.getLogger(MainFrame.class);
	private JPanel mainPanel;
	public MainFrame() {
		initComponents();
	}
	
	private void initComponents() {
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		
		
		
		JBasicTable table = new JBasicTable();
		List<CustomApplication> customApplications = CustomApplicationDAO.getData();
		
		
		String[] titles = new String[2];
		titles[0]="Name";
		//titles[1]="Value";
		int size = customApplications.size();
		//setTableModel(table, customApplications, titles);
		logger.info("Rows:"+ table.getRowCount());
		PaginationContext paginationContext = new PaginationContext(size);
		//paginationContext.setPageIndex(23);
		//a page has <setRowCount>
		//paginationContext.setRowCount(67);
		//paginationContext.setRowIndex(1);
		
		
		
		DemoPaginationBar bar = new DemoPaginationBar(table,customApplications,paginationContext);
		
		List<ElementNode> elementNodes = new ArrayList<ElementNode>();
		elementNodes.add(new ElementNode("Name", IconFactory.getSwingIcon("stereo/home_16.png"), "Name"));
		
		bar.setSortNameList(elementNodes);
		
	
		mainPanel = new JPanel();
		
		mainPanel.add(bar);
		mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.LINE_AXIS));
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				
		.addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup()
					
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)));

	
		pack();
		setVisible(true);
	}
	
	  //Just for create a default List to show.
	
  
    
   
   
}
