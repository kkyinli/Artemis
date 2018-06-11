/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 16:13:17 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.plot.HydrophilicityAlgorithm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HydroAlgorithm_ESTest extends HydroAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm((Feature) null);
      float[] floatArray0 = new float[9];
      // Undeclared exception!
      try { 
        hydrophilicityAlgorithm0.getValues((-444), (-444), floatArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.HydroAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm((Feature) null);
      Integer integer0 = hydrophilicityAlgorithm0.getDefaultMinWindowSize();
      assertNotNull(integer0);
      assertEquals(7, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm((Feature) null);
      Integer integer0 = hydrophilicityAlgorithm0.getDefaultMaxWindowSize();
      assertNotNull(integer0);
      assertEquals(100, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm((Feature) null);
      Integer integer0 = hydrophilicityAlgorithm0.getDefaultWindowSize();
      assertEquals(7, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm((Feature) null);
      Float float0 = hydrophilicityAlgorithm0.getAverage();
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm((Feature) null);
      hydrophilicityAlgorithm0.getDefaultStepSize((-444));
  }
}