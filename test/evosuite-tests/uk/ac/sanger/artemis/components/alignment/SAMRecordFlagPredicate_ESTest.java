/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:29:14 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import htsjdk.samtools.SAMFileHeader;
import htsjdk.samtools.SAMRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.alignment.SAMRecordFlagPredicate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SAMRecordFlagPredicate_ESTest extends SAMRecordFlagPredicate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate((-1003));
      int[] intArray0 = new int[4];
      SAMRecordFlagPredicate.FLAGS = intArray0;
      intArray0[0] = (-1003);
      SAMRecord sAMRecord0 = new SAMRecord((SAMFileHeader) null);
      boolean boolean0 = sAMRecordFlagPredicate0.testPredicate(sAMRecord0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate(58, false);
      int[] intArray0 = new int[5];
      intArray0[0] = 1653;
      intArray0[1] = 58;
      intArray0[2] = 58;
      intArray0[3] = 58;
      intArray0[4] = (-1258);
      SAMRecordFlagPredicate.FLAGS = intArray0;
      SAMRecord sAMRecord0 = new SAMRecord((SAMFileHeader) null);
      boolean boolean0 = sAMRecordFlagPredicate0.testPredicate(sAMRecord0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate(0);
      // Undeclared exception!
      try { 
        sAMRecordFlagPredicate0.testPredicate((SAMRecord) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.alignment.SAMRecordFlagPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SAMRecordFlagPredicate sAMRecordFlagPredicate0 = new SAMRecordFlagPredicate(58, false);
      int[] intArray0 = new int[5];
      SAMRecordFlagPredicate.FLAGS = intArray0;
      SAMRecord sAMRecord0 = new SAMRecord((SAMFileHeader) null);
      boolean boolean0 = sAMRecordFlagPredicate0.testPredicate(sAMRecord0);
      assertFalse(boolean0);
  }
}