/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:48:11 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.Feature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Feature_ESTest extends Feature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Feature feature0 = new Feature("", 1202, 0, (-2939));
      int int0 = feature0.getStart();
      assertEquals(0, feature0.getEnd());
      assertEquals((-2939), feature0.getColour());
      assertEquals(1202, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Feature feature0 = new Feature((String) null, (-272), (-272), (-1));
      int int0 = feature0.getStart();
      assertEquals((-272), int0);
      assertEquals((-272), feature0.getEnd());
      assertEquals((-1), feature0.getColour());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Feature feature0 = new Feature("~X=:3e0M.Gq>IS", 0, 0, 0);
      int int0 = feature0.getEnd();
      assertEquals(0, int0);
      assertEquals(0, feature0.getColour());
      assertEquals(0, feature0.getStart());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Feature feature0 = new Feature("JR", (-1173), 58, (-1173));
      int int0 = feature0.getEnd();
      assertEquals(58, int0);
      assertEquals((-1173), feature0.getColour());
      assertEquals((-1173), feature0.getStart());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Feature feature0 = new Feature((String) null, (-3036), (-1462), (-3036));
      feature0.getEmblKey();
      assertEquals((-3036), feature0.getStart());
      assertEquals((-1462), feature0.getEnd());
      assertEquals((-3036), feature0.getColour());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Feature feature0 = new Feature("", (-2297), (-2297), (-2297));
      feature0.getEmblKey();
      assertEquals((-2297), feature0.getEnd());
      assertEquals((-2297), feature0.getStart());
      assertEquals((-2297), feature0.getColour());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Feature feature0 = new Feature("Trp", 5165, 5165, 5165);
      int int0 = feature0.getColour();
      assertEquals(5165, feature0.getStart());
      assertEquals(5165, int0);
      assertEquals(5165, feature0.getEnd());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Feature feature0 = new Feature("", (-2297), (-2297), (-2297));
      int int0 = feature0.getColour();
      assertEquals((-2297), feature0.getStart());
      assertEquals((-2297), feature0.getEnd());
      assertEquals((-2297), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Feature feature0 = new Feature("", 0, 0, 0);
      feature0.getArtemisFeature();
      assertEquals(0, feature0.getColour());
      assertEquals(0, feature0.getStart());
      assertEquals(0, feature0.getEnd());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Feature feature0 = new Feature("#", (-1), (-1), 11);
      int int0 = feature0.getEnd();
      assertEquals((-1), int0);
      assertEquals((-1), feature0.getStart());
      assertEquals(11, feature0.getColour());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Feature feature0 = new Feature("", 0, 0, 0);
      int int0 = feature0.getStart();
      assertEquals(0, feature0.getColour());
      assertEquals(0, feature0.getEnd());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Feature feature0 = new Feature("", 0, 0, 0);
      int int0 = feature0.getColour();
      assertEquals(0, int0);
      assertEquals(0, feature0.getStart());
      assertEquals(0, feature0.getEnd());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Feature feature0 = new Feature("!m9qq4zv]%z", 1979, 1979, 1979);
      feature0.getEmblKey();
      assertEquals(1979, feature0.getStart());
      assertEquals(1979, feature0.getColour());
      assertEquals(1979, feature0.getEnd());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Feature feature0 = new Feature("#", (-1), (-1), 11);
      feature0.setEnd((-1));
      assertEquals(11, feature0.getColour());
      assertEquals((-1), feature0.getEnd());
      assertEquals((-1), feature0.getStart());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Feature feature0 = new Feature("!m9qq4zv]%z", 1979, 1979, 1979);
      uk.ac.sanger.artemis.Feature feature1 = feature0.getArtemisFeature();
      assertNotNull(feature1);
      assertEquals(1979, feature0.getStart());
      assertEquals(1979, feature0.getEnd());
      assertEquals(1979, feature0.getColour());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Feature feature0 = new Feature("!m9qq4zv]%z", 1979, 1979, 1979);
      feature0.setColour(1979);
      assertEquals(1979, feature0.getEnd());
      assertEquals(1979, feature0.getStart());
      assertEquals(1979, feature0.getColour());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Feature feature0 = new Feature("!m9qq4zv]%z", 1979, 1979, 1979);
      feature0.setEmblKey("exon-model");
      uk.ac.sanger.artemis.Feature feature1 = feature0.getArtemisFeature();
      assertEquals(1979, feature0.getEnd());
      assertNotNull(feature1);
      assertEquals(1979, feature0.getColour());
      assertEquals(1979, feature0.getStart());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Feature feature0 = new Feature("!m9qq4zv]%z", 1979, 1979, 1979);
      feature0.setStart(1979);
      assertEquals(1979, feature0.getStart());
      assertEquals(1979, feature0.getColour());
      assertEquals(1979, feature0.getEnd());
  }
}
