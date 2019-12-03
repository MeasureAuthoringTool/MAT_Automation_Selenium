$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/01smoke.feature");
formatter.feature({
  "line": 2,
  "name": "smoke1: Sprint smoke stories",
  "description": "",
  "id": "smoke1:-sprint-smoke-stories",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@mat"
    }
  ]
});
formatter.before({
  "duration": 932552,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "1. Initial population as SDE Ethincity",
  "description": "",
  "id": "smoke1:-sprint-smoke-stories;1.-initial-population-as-sde-ethincity",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I launch MAT QA Website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"PerformanceUser4\" \"Helloworld123?\" \"1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I clicked Sign into UMLS",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter \"skadaru\" \"Manoher123#\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click New Measure Link",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter new measure name as \"Smoke test\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter CQL title name as \"Smoketitle\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter eCQM title name as \"Smoke title\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I select measure scoring type \"Cohort\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I select patient based indicator as \"No\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I select population workspace",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I select initial population",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I select initial population as \"SDE Ethnicity\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I select save button on initial population",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginULMS.i_launch_MAT_QA_Website_https_mat_test_mat_us_MeasureAuthoringTool_Login_html()"
});
formatter.result({
  "duration": 5336834781,
  "status": "passed"
});
formatter.match({
  "location": "LoginULMS.i_should_login_page()"
});
formatter.result({
  "duration": 101026637,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PerformanceUser4",
      "offset": 9
    },
    {
      "val": "Helloworld123?",
      "offset": 28
    },
    {
      "val": "1234",
      "offset": 45
    }
  ],
  "location": "LoginULMS.i_enter_Username_password_Security_code(String,String,String)"
});
formatter.result({
  "duration": 5551551944,
  "status": "passed"
});
formatter.match({
  "location": "LoginULMS.i_see_CQL_Workspace()"
});
formatter.result({
  "duration": 71627601,
  "error_message": "java.lang.Exception: Element Not found or Element state not ready to perform action\n\tat engine.ActionEngine.click(ActionEngine.java:238)\n\tat stepdefinitions.LoginULMS.i_see_CQL_Workspace(LoginULMS.java:46)\n\tat ✽.When I clicked Sign into UMLS(src/test/java/features/01smoke.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "skadaru",
      "offset": 9
    },
    {
      "val": "Manoher123#",
      "offset": 19
    }
  ],
  "location": "LoginULMS.i_enter_Umls_Username_Umls_Pwd(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MeasureLibraryOR.i_click_New_Measure_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Smoke test",
      "offset": 29
    }
  ],
  "location": "MeasureLibraryOR.ente_new_measure_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Smoketitle",
      "offset": 27
    }
  ],
  "location": "MeasureLibraryOR.ente_new_z_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Smoke title",
      "offset": 28
    }
  ],
  "location": "MeasureLibraryOR.ente_new_measureeCQM_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cohort",
      "offset": 31
    }
  ],
  "location": "MeasureLibraryOR.measure_scoring_type(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "No",
      "offset": 37
    }
  ],
  "location": "MeasureLibraryOR.select_patient_based_indicator(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PopulationWorkspace.select_population_workpspace()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MeasureLibraryOR.select_initial_population()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SDE Ethnicity",
      "offset": 32
    }
  ],
  "location": "MeasureLibraryOR.select_population(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MeasureLibraryOR.select_initial_population_save()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 7016790,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: window was already closed\n  (Session info: chrome\u003d78.0.3904.108)\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027CVasile-MBPro.lan\u0027, ip: \u0027fe80:0:0:0:182c:b5ea:4b5a:503e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: /var/folders/p7/6xc7lbfj3hz...}, goog:chromeOptions: {debuggerAddress: localhost:53075}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3d0f10ad0ab10ec0858d7b7594f54bb5\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\n\tat stepdefinitions.AbstractTestBase.forAfterScen(AbstractTestBase.java:32)\n\tat stepdefinitions.BeforeAfterHooks.afterScenario(BeforeAfterHooks.java:16)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCukes(TestNGCucumberRunner.java:50)\n\tat tests.CukesRunnerTest.runCukes(CukesRunnerTest.java:62)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\n\tat org.testng.TestRunner.run(TestRunner.java:632)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\n\tat org.testng.TestNG.run(TestNG.java:1064)\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:73)\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\n",
  "status": "failed"
});
formatter.before({
  "duration": 121375,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "2. Measure pacakge",
  "description": "",
  "id": "smoke1:-sprint-smoke-stories;2.-measure-pacakge",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I select measure pacakage tab",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I select initial population and arrow button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click save grouping button",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I verify the grouping succes message",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click save measure package button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I click export measure package button",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I clik on signout link",
  "keyword": "When "
});
formatter.match({
  "location": "MeasureLibraryOR.select_measure_package_tab()"
});
formatter.result({
  "duration": 15562513,
  "error_message": "java.lang.Exception: Element Not found or Element state not ready to perform action\n\tat engine.ActionEngine.click(ActionEngine.java:238)\n\tat stepdefinitions.MeasureLibraryOR.select_measure_package_tab(MeasureLibraryOR.java:897)\n\tat ✽.When I select measure pacakage tab(src/test/java/features/01smoke.feature:24)\n",
  "status": "failed"
});
formatter.match({
  "location": "MeasureLibraryOR.select_initial_population_text()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MeasureLibraryOR.save_grouping()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MeasureLibraryOR.verify_group_success_msg()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MeasureLibraryOR.save_measure_packegeButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MeasureLibraryOR.measure_packegeButtonExport()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginULMS.i_clik_on_signout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 5553211,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: window was already closed\n  (Session info: chrome\u003d78.0.3904.108)\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027CVasile-MBPro.lan\u0027, ip: \u0027fe80:0:0:0:182c:b5ea:4b5a:503e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: /var/folders/p7/6xc7lbfj3hz...}, goog:chromeOptions: {debuggerAddress: localhost:53075}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3d0f10ad0ab10ec0858d7b7594f54bb5\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\n\tat stepdefinitions.AbstractTestBase.forAfterScen(AbstractTestBase.java:32)\n\tat stepdefinitions.BeforeAfterHooks.afterScenario(BeforeAfterHooks.java:16)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCukes(TestNGCucumberRunner.java:50)\n\tat tests.CukesRunnerTest.runCukes(CukesRunnerTest.java:62)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\n\tat org.testng.TestRunner.run(TestRunner.java:632)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\n\tat org.testng.TestNG.run(TestNG.java:1064)\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:73)\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\n",
  "status": "failed"
});
});