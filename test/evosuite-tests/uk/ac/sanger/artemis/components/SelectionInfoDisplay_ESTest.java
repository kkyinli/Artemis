/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:10:36 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.datatransfer.Clipboard;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Selection;
import uk.ac.sanger.artemis.SelectionChangeEvent;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.components.SelectionInfoDisplay;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectionInfoDisplay_ESTest extends SelectionInfoDisplay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Clipboard clipboard0 = new Clipboard("embossData");
      Selection selection0 = new Selection(clipboard0);
      SelectionInfoDisplay selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, selection0);
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        selectionInfoDisplay0.paintComponent(debugGraphics0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      // Undeclared exception!
      try { 
        SelectionInfoDisplay.markerRangeText((Selection) null, simpleEntryGroup0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.SelectionInfoDisplay", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      SelectionInfoDisplay selectionInfoDisplay0 = null;
      try {
        selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, (Selection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.SelectionInfoDisplay", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("-");
      Selection selection0 = new Selection(clipboard0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      String string0 = SelectionInfoDisplay.markerRangeText(selection0, simpleEntryGroup0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Clipboard clipboard0 = new Clipboard("embossData");
      Selection selection0 = new Selection(clipboard0);
      SelectionInfoDisplay selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, selection0);
      SelectionChangeEvent selectionChangeEvent0 = new SelectionChangeEvent(clipboard0, 688);
      selectionInfoDisplay0.selectionChanged(selectionChangeEvent0);
      assertEquals(3, SelectionChangeEvent.OBJECT_CHANGED);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("-");
      Selection selection0 = new Selection(clipboard0);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      SelectionInfoDisplay selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, selection0);
      Dimension dimension0 = selectionInfoDisplay0.getMinimumSize();
      assertEquals(10, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      Clipboard clipboard0 = new Clipboard("embossData");
      Selection selection0 = new Selection(clipboard0);
      SelectionInfoDisplay selectionInfoDisplay0 = new SelectionInfoDisplay(simpleEntryGroup0, selection0);
      Dimension dimension0 = selectionInfoDisplay0.getPreferredSize();
      assertEquals(10, dimension0.width);
  }
}
