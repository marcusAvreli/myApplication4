package myApplication4;




import java.util.List;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import myApplication4.element.ElementNode;
import myApplication4.pagination.PaginationBar;
import myApplication4.pagination.PaginationContext;
import myApplication4.nepxion.swing.table.BasicTableModel;
import myApplication4.nepxion.swing.table.JBasicTable;


	public  class DemoPaginationBar
		extends PaginationBar
	{
		private static final Logger logger = LoggerFactory.getLogger(DemoPaginationBar.class);
		private static final long serialVersionUID = 1L;

		public DemoPaginationBar(JBasicTable table,List<CustomApplication> customApplications,PaginationContext paginationContext)
		{
			super(table, paginationContext);
			setTableModel(table, customApplications, getSortNameList());
			setLayout();
			
			
		}
		
		public String[] getSortNameList()
		{
			return new String[] {"Name", "Value"};
		}
				
		public void directRowIndex(int rowIndex)
			throws Exception
		{
			logger.info("direct row index");
			JBasicTable table = (JBasicTable) getTable();
			PaginationContext paginationContext = getPaginationContext();
			paginationContext.setRowIndex(rowIndex);
			direct(table);
		}
		
		public void directRowCount(int rowCount)
			throws Exception
		{
			JBasicTable table = (JBasicTable) getTable();
			logger.info("direct row count");
			PaginationContext paginationContext = getPaginationContext();
			paginationContext.setRowCount(rowCount);
			
			direct(table);
		}
		
		private void direct(JTable table)
			throws Exception
		{
			PaginationContext paginationContext = getPaginationContext();
			
			//first row of page
			int rowIndex = paginationContext.getRowIndex();
			
			//rows per page
			int rowCount = paginationContext.getRowCount();
			
			logger.info("row_index:"+rowIndex);
			logger.info("row_count:"+rowCount);
			TableModel model = table.getModel();
			if(model instanceof BasicTableModel) {
				
				List<CustomApplication> rows = CustomApplicationDAO.getData();
					 
				int startIndex = rowIndex;
				int endIndex = rowIndex + rowCount;
				if (endIndex > paginationContext.getTotalRowCount()) {
				    endIndex = paginationContext.getTotalRowCount();
				}				
				if(startIndex == 1) {
					startIndex = 0;
				}
				List<CustomApplication> subRows = rows.subList(startIndex, endIndex);
				
				setTableModel(table, subRows, getSortNameList());
				
			}

			




			updatePagination();
		}
		
		public void sort(ElementNode sortName, ElementNode sortType)
			throws Exception
		{
			
		}
		
		public void clearRowDatas()
			throws Exception
		{
			getTable();	
			
		}
		
		
	}
