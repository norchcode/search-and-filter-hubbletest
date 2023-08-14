import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.waitForPageLoad(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tokopedia - Spesial Traktir Ultah, Tum_3df291/input_Kategori_css-3017qm exxxdg63'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Tokopedia - Spesial Traktir Ultah, Tum_3df291/input_Kategori_css-3017qm exxxdg63'), 
    'iphone 14 pro')

WebUI.waitForPageLoad(3)

WebUI.sendKeys(findTestObject('Object Repository/Page_Tokopedia - Spesial Traktir Ultah, Tum_3df291/input_Kategori_css-3017qm exxxdg63'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/h6_Jenis toko'), 'Jenis toko')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/label_Official Store'), 'Official Store')

WebUI.click(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/span_Jenis toko_css-1i85qm8-unf-checkbox__a_7a1112'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/button_Lokasi'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/h6_Harga'), 'Harga')

WebUI.click(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmin'))

WebUI.setText(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmin'), '100000')

WebUI.sendKeys(findTestObject('Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmin'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/button_Lokasi'))

WebUI.click(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmax'))

WebUI.setText(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmax'), '30000000')

WebUI.sendKeys(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmax'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/span_Urutkan'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/svg_Urutkan_unf-icon css-1w4dubj'))

WebUI.click(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/svg_Urutkan_unf-icon css-1w4dubj'))

WebUI.mouseOver(findTestObject('Page_Jual iphone 14 pro  Tokopedia/button_Harga Terendah'))

WebUI.click(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/button_Harga Terendah'))

WebUI.waitForPageLoad(4)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

// Create an empty list to store item names
itemNames = []

// Function to extract item names from a page
extractItemNames()

WebUI.waitForPageLoad(3)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/Next Page'))

WebUI.waitForPageLoad(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.waitForPageLoad(4)

WebUI.click(findTestObject('Page_Jual iphone 14 pro  Tokopedia/svg_NextPage2'))

WebUI.waitForPageLoad(4)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.waitForPageLoad(3)

extractItemNames()

WebUI.waitForPageLoad(3)

extractItemNames()

// Print the collected item names
println(itemNames)

def extractItemNames() {
    elements = DriverFactory.getWebDriver().findElements(By.cssSelector('div.prd_link-product-name.css-3um8ox'))

    for (WebElement element : elements) {
        itemNames.add(element.getText())
    }
    
    WebUI.closeBrowser()
}

