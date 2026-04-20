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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://grocery-store-app-seven.vercel.app/')

WebUI.click(findTestObject('Page_Grocery Store  Grocery Store MVC/a_Auth'))

WebUI.setText(findTestObject('Page_Autentikasi  Token  Grocery Store MVC/input_Contoh_ Budi di Laptop Kantor'),
    "User_${System.currentTimeMillis()}")

WebUI.setText(findTestObject('Page_Autentikasi  Token  Grocery Store MVC/input_Contoh_ budi123example.com'),
    "test${System.currentTimeMillis()}@mail.com")

WebUI.click(findTestObject('Page_Autentikasi  Token  Grocery Store MVC/button_Daftar  Dapatkan Token'))

WebUI.click(findTestObject('Page_Autentikasi  Token  Grocery Store MVC/code_8dc1d7362a52d6655e858b65807ecfe0fd192e31aa8'))

WebUI.click(findTestObject('Page_Grocery Store  Grocery Store MVC/a_Auth_1'))

WebUI.setText(findTestObject('Page_Autentikasi  Token  Grocery Store MVC/textarea_Paste token kamu di sini'), '8dc1d7362a52d6655e858b65807ecfe0fd192e31aa884fdd2f94aca622ed3167')

WebUI.click(findTestObject('Page_Autentikasi  Token  Grocery Store MVC/button_Simpan Token'))

WebUI.click(findTestObject('Page_Autentikasi  Token  Grocery Store MVC/a_Produk'))

WebUI.selectOptionByValue(findTestObject('Page_Semua Produk  Grocery Store MVC/select_category'), 'meat-seafood', false)

WebUI.selectOptionByValue(findTestObject('Page_Semua Produk  Grocery Store MVC/select_results'), '5', false)

WebUI.click(findTestObject('Page_Semua Produk  Grocery Store MVC/button_Filter'))

WebUI.click(findTestObject('Page_Semua Produk  Grocery Store MVC/a_Reset'))

WebUI.click(findTestObject('Page_Semua Produk  Grocery Store MVC/a_Detail'))

WebUI.click(findTestObject('Page_Angus Steak Burgers  Grocery Store MVC/a_Kembali ke Produk'))

WebUI.click(findTestObject('Page_Semua Produk  Grocery Store MVC/a_Keranjang'))

WebUI.click(findTestObject('Page_Keranjang Belanja  Grocery Store MVC/button_Buat Cart Baru'))

WebUI.setText(findTestObject('Page_Keranjang Belanja  Grocery Store MVC/input_Contoh_ 4646'), '4646')

WebUI.setText(findTestObject('Page_Keranjang Belanja  Grocery Store MVC/input_quantity'), '5')

WebUI.click(findTestObject('Page_Keranjang Belanja  Grocery Store MVC/button_Tambah'))

WebUI.click(findTestObject('Page_Keranjang Belanja  Grocery Store MVC/button_Update Jumlah'))

WebUI.setText(findTestObject('Page_Keranjang Belanja  Grocery Store MVC/input_quantity_1'), '10')

WebUI.click(findTestObject('Page_Keranjang Belanja  Grocery Store MVC/button_Update Jumlah'))

WebUI.click(findTestObject('Page_Keranjang Belanja  Grocery Store MVC/a_Lanjut ke Checkout'))

WebUI.setText(findTestObject('Page_Buat Pesanan Baru  Grocery Store MVC/input_Contoh_ Budi Santoso'), 'safah')

WebUI.click(findTestObject('Page_Buat Pesanan Baru  Grocery Store MVC/button_Buat Pesanan Sekarang'))

WebUI.click(findTestObject('Page_Semua Pesanan  Grocery Store MVC/a_Edit'))

WebUI.setText(findTestObject('Page_Edit Pesanan Xikdvr2LCV9kpeyn7y87K  Gr_417d76/textarea_Contoh_ Pickup at 2PM. Tolong bawa kant'), 
    'ke kantor')

WebUI.click(findTestObject('Page_Edit Pesanan Xikdvr2LCV9kpeyn7y87K  Gr_417d76/button_Simpan Perubahan'))

