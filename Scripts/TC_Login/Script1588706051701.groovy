import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('D:\\Katalon\\Android\\Data Files\\Foody.apk', false)

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Login/BtnProfile'), 0)

Mobile.tap(findTestObject('Login/BtnLogin'), 0)

Mobile.tap(findTestObject('Login/FrLogin'), 0)

Mobile.tap(findTestObject('Login/FrLoginInside'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Login/FrLoginBy'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('null'), 0)

Mobile.tap(findTestObject('Login/BtnFb'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/FrFacebook'), 0)

Mobile.tap(findTestObject('Login/FrFacebookInside'), 0)

Mobile.tap(findTestObject('Login/FrSubpartFacebook'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

not_run: Mobile.tap(findTestObject('null'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Login/TxtnoHp'), '081264411111', 0)

Mobile.setText(findTestObject('Login/TxtPassword'), 'testingfacebook123', 0)

Mobile.tap(findTestObject('Login/BtnMasuk'), 0)

Mobile.tap(findTestObject('Login/BtnLANJUTKAN'), 0)

//testcek