/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:01:22 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.components.FeatureInfo;
import uk.ac.sanger.artemis.plot.CodonUsageAlgorithm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeatureInfo_ESTest extends FeatureInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeatureInfo featureInfo0 = null;
      try {
        featureInfo0 = new FeatureInfo((Feature) null, (CodonUsageAlgorithm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.FeatureInfo", e);
      }
  }
}