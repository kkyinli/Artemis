/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 13:03:30 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.QualifierTextArea;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QualifierTextArea_ESTest extends QualifierTextArea_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = QualifierTextArea.getEndOfLink("*r8O'BdYI/", 2);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        QualifierTextArea.getEndOfLink((String) null, 44);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.QualifierTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSpinner jSpinner0 = new JSpinner();
      JComponent jComponent0 = jSpinner0.getEditor();
      QualifierTextArea.handleMouseSingleClick((String) null, jComponent0);
      assertFalse(jComponent0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JPanel jPanel0 = new JPanel();
      // Undeclared exception!
      try { 
        QualifierTextArea.handleMouseSingleClick("zA*(,A_", jPanel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.QualifierTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = QualifierTextArea.getEndOfLink("rIa$T_:b|VJY6N)wx", (-943));
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = QualifierTextArea.getEndOfLink("the Allele Number (AN) tag is incorrect for the record at position %s:%d, %d vs. %d", 0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      QualifierTextArea qualifierTextArea0 = null;
      try {
        qualifierTextArea0 = new QualifierTextArea();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.text.JTextComponent", e);
      }
  }
}
