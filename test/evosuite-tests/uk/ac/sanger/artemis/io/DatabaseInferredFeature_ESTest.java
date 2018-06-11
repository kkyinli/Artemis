/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:34:22 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.EntryGroup;
import uk.ac.sanger.artemis.FeatureChangeEvent;
import uk.ac.sanger.artemis.FeatureKeyQualifierPredicate;
import uk.ac.sanger.artemis.FilteredEntryGroup;
import uk.ac.sanger.artemis.SimpleEntryGroup;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.BlastStreamFeature;
import uk.ac.sanger.artemis.io.ChadoCanonicalGene;
import uk.ac.sanger.artemis.io.DatabaseInferredFeature;
import uk.ac.sanger.artemis.io.GenbankStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.io.RangeVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DatabaseInferredFeature_ESTest extends DatabaseInferredFeature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      Range range0 = new Range(5);
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, false);
      QualifierVector qualifierVector0 = new QualifierVector();
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      DatabaseInferredFeature databaseInferredFeature0 = new DatabaseInferredFeature(key0, location0, qualifierVector0, chadoCanonicalGene0);
      // Undeclared exception!
      try { 
        databaseInferredFeature0.updateInferredLocations();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.DatabaseInferredFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Key key0 = Key.CDS;
      Range range0 = new Range(75);
      Location location0 = new Location(range0);
      QualifierVector qualifierVector0 = new QualifierVector();
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      DatabaseInferredFeature databaseInferredFeature0 = new DatabaseInferredFeature(key0, location0, qualifierVector0, chadoCanonicalGene0);
      // Undeclared exception!
      try { 
        databaseInferredFeature0.featureChanged((FeatureChangeEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.DatabaseInferredFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        DatabaseInferredFeature.addListenersToEntryGroup((EntryGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.DatabaseInferredFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      QualifierVector qualifierVector0 = new QualifierVector();
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      DatabaseInferredFeature databaseInferredFeature0 = null;
      try {
        databaseInferredFeature0 = new DatabaseInferredFeature(key0, (Location) null, qualifierVector0, chadoCanonicalGene0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.GFFStreamFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Key key0 = Key.CDS;
      Range range0 = new Range(75);
      Location location0 = new Location(range0);
      QualifierVector qualifierVector0 = new QualifierVector();
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      DatabaseInferredFeature databaseInferredFeature0 = new DatabaseInferredFeature(key0, location0, qualifierVector0, chadoCanonicalGene0);
      databaseInferredFeature0.setLocation(location0);
      assertNull(databaseInferredFeature0.getGffSeqName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Key key0 = new Key("eX", true);
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      FeatureKeyQualifierPredicate featureKeyQualifierPredicate0 = new FeatureKeyQualifierPredicate(key0, "eX", "(U/gmq+c\"^C&", true, true);
      FilteredEntryGroup filteredEntryGroup0 = new FilteredEntryGroup(simpleEntryGroup0, featureKeyQualifierPredicate0, (String) null);
      DatabaseInferredFeature.addListenersToEntryGroup(filteredEntryGroup0);
      assertEquals(0, filteredEntryGroup0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      Range range0 = new Range(5);
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, false);
      QualifierVector qualifierVector0 = new QualifierVector();
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      DatabaseInferredFeature databaseInferredFeature0 = new DatabaseInferredFeature(key0, location0, qualifierVector0, chadoCanonicalGene0);
      databaseInferredFeature0.addFeatureListeners();
      assertTrue(databaseInferredFeature0.isVisible());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Key key0 = Key.CDS;
      Range range0 = new Range(75);
      Location location0 = new Location(range0);
      QualifierVector qualifierVector0 = new QualifierVector();
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      DatabaseInferredFeature databaseInferredFeature0 = new DatabaseInferredFeature(key0, location0, qualifierVector0, chadoCanonicalGene0);
      // Undeclared exception!
      try { 
        databaseInferredFeature0.addFeatureListeners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.DatabaseInferredFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GenbankStreamFeature genbankStreamFeature0 = new GenbankStreamFeature();
      BlastStreamFeature blastStreamFeature0 = new BlastStreamFeature(genbankStreamFeature0);
      ChadoCanonicalGene chadoCanonicalGene0 = new ChadoCanonicalGene();
      // Undeclared exception!
      try { 
        DatabaseInferredFeature.createFeature("", blastStreamFeature0, chadoCanonicalGene0, (uk.ac.sanger.artemis.Entry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.DatabaseInferredFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Key key0 = new Key("eX", true);
      Range range0 = new Range((-808), (-808));
      RangeVector rangeVector0 = new RangeVector(range0);
      Location location0 = new Location(rangeVector0, true);
      DatabaseInferredFeature databaseInferredFeature0 = new DatabaseInferredFeature(key0, location0, (QualifierVector) null, (ChadoCanonicalGene) null);
      databaseInferredFeature0.setLocation(location0);
  }
}