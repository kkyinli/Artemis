/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:04:35 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.InvalidQualifierException;
import uk.ac.sanger.artemis.io.Qualifier;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidQualifierException_ESTest extends InvalidQualifierException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvalidQualifierException invalidQualifierException0 = new InvalidQualifierException((String) null, (Qualifier) null);
      Qualifier qualifier0 = invalidQualifierException0.getQualifier();
      assertNull(qualifier0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("", "");
      InvalidQualifierException invalidQualifierException0 = new InvalidQualifierException("", qualifier0);
      Qualifier qualifier1 = invalidQualifierException0.getQualifier();
      assertSame(qualifier0, qualifier1);
  }
}