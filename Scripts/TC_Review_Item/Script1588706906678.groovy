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

Mobile.tap(findTestObject('Review Item/BtnReview'), 0)

Mobile.tap(findTestObject('Review Item/TxtTitle'), 0)

Mobile.setText(findTestObject('Review Item/TxtTitle'), 'Ice Cream', 0)

Mobile.tap(findTestObject('Review Item/TxtContent'), 0)

Mobile.setText(findTestObject('Review Item/TxtContent'), 'This is the best ever', 0)

Mobile.tap(findTestObject('Review Item/BtnPost'), 0)

Mobile.tap(findTestObject('Review Item/BtnRate'), 0)

Mobile.tap(findTestObject('Review Item/BtnNoPerson'), 0)

Mobile.tap(findTestObject('Review Item/Btn8'), 0)

Mobile.tap(findTestObject('Review Item/BtnExpense'), 0)

Mobile.tap(findTestObject('Review Item/Btn50000'), 0)

Mobile.tap(findTestObject('Review Item/BtnComeback'), 0)

Mobile.tap(findTestObject('Review Item/BtnSure'), 0)

Mobile.tap(findTestObject('Review Item/BtnDone'), 0)

Mobile.tap(findTestObject('Review Item/BtnPost'), 0)

Mobile.tap(findTestObject('Review Item/BtnCLOSE'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

