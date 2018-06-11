/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:07:17 GMT 2018
 */

package uk.ac.sanger.artemis.components.filetree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.event.EventListenerList;
import javax.swing.event.TreeModelEvent;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.javax.swing.MockDefaultListSelectionModel;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.filetree.AbstractCellEditor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractCellEditor_ESTest extends AbstractCellEditor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      JTable jTable0 = new JTable(0, 0);
      abstractCellEditor0.addCellEditorListener(jTable0);
      abstractCellEditor0.addCellEditorListener(jTable0);
      abstractCellEditor0.fireEditingCanceled();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      JTable jTable0 = new JTable(0, 0);
      abstractCellEditor0.addCellEditorListener(jTable0);
      abstractCellEditor0.addCellEditorListener(jTable0);
      abstractCellEditor0.fireEditingStopped();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.listenerList = null;
      JTable jTable0 = new JTable((TableModel) null);
      // Undeclared exception!
      try { 
        abstractCellEditor0.removeCellEditorListener(jTable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.AbstractCellEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      EventListenerList eventListenerList0 = abstractCellEditor0.listenerList;
      abstractCellEditor0.listenerList = eventListenerList0;
      abstractCellEditor0.listenerList = null;
      // Undeclared exception!
      try { 
        abstractCellEditor0.fireEditingStopped();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.AbstractCellEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.listenerList = null;
      // Undeclared exception!
      try { 
        abstractCellEditor0.fireEditingCanceled();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.AbstractCellEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.listenerList = null;
      // Undeclared exception!
      try { 
        abstractCellEditor0.addCellEditorListener((CellEditorListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.AbstractCellEditor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      EventListenerList eventListenerList0 = abstractCellEditor0.listenerList;
      Class<JTable> class0 = JTable.class;
      Object[][] objectArray0 = new Object[6][2];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray0[0]);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      MockDefaultListSelectionModel mockDefaultListSelectionModel0 = new MockDefaultListSelectionModel();
      JTable jTable0 = new JTable(defaultTableModel0, defaultTableColumnModel0, mockDefaultListSelectionModel0);
      eventListenerList0.add(class0, jTable0);
      abstractCellEditor0.fireEditingCanceled();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      EventListenerList eventListenerList0 = abstractCellEditor0.listenerList;
      JTable jTable0 = new JTable(439, 439);
      Class<JTable> class0 = JTable.class;
      eventListenerList0.add(class0, jTable0);
      abstractCellEditor0.fireEditingStopped();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) abstractCellEditor0;
      objectArray0[1] = (Object) abstractCellEditor0;
      objectArray0[2] = (Object) abstractCellEditor0;
      TreeModelEvent treeModelEvent0 = new TreeModelEvent(abstractCellEditor0, objectArray0);
      boolean boolean0 = abstractCellEditor0.isCellEditable(treeModelEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      Object object0 = abstractCellEditor0.getCellEditorValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      boolean boolean0 = abstractCellEditor0.stopCellEditing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("c_g_dKIE:nqh", false);
      ItemEvent itemEvent0 = new ItemEvent(jRadioButtonMenuItem0, 66, abstractCellEditor0, 66);
      boolean boolean0 = abstractCellEditor0.shouldSelectCell(itemEvent0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      JTable jTable0 = new JTable(0, 0);
      abstractCellEditor0.removeCellEditorListener(jTable0);
      assertFalse(jTable0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.cancelCellEditing();
      assertTrue(abstractCellEditor0.stopCellEditing());
  }
}