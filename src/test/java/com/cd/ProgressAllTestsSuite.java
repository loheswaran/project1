package com.cd;

import org.jenkinsci.testinprogress.runner.ProgressSuite;

import org.jenkinsci.testinprogress.runner.ProgressBatchSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(ProgressBatchSuite.class)
@SuiteClasses({ AppTest.class})
public class ProgressAllTestsSuite {

}
