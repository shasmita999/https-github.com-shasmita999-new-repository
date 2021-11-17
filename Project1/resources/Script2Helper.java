// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>Script2</b><br>
 * Generated     : <b>2021/11/17 2:45:25 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows Server 2012 R2 amd64 6.3 <br>
 * 
 * @since  November 17, 2021
 * @author admin
 */
public abstract class Script2Helper extends RationalTestScript
{
	/**
	 * htmlBrowser: with default state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : Chrome
	 * 		.processName : chrome.exe
	 */
	protected BrowserTestObject browser_htmlBrowser() 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"));
	}
	/**
	 * htmlBrowser: with specific test context and state.
	 *		.class : Html.HtmlBrowser
	 * 		.browserName : Chrome
	 * 		.processName : chrome.exe
	 */
	protected BrowserTestObject browser_htmlBrowser(TestObject anchor, long flags) 
	{
		return new BrowserTestObject(
                        getMappedTestObject("browser_htmlBrowser"), anchor, flags);
	}
	
	/**
	 * Google: with default state.
	 *		.class : Html.HtmlDocument
	 * 		.title : Google
	 * 		.url : https://www.google.com/
	 */
	protected DocumentTestObject document_google() 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_google"));
	}
	/**
	 * Google: with specific test context and state.
	 *		.class : Html.HtmlDocument
	 * 		.title : Google
	 * 		.url : https://www.google.com/
	 */
	protected DocumentTestObject document_google(TestObject anchor, long flags) 
	{
		return new DocumentTestObject(
                        getMappedTestObject("document_google"), anchor, flags);
	}
	
	

	protected Script2Helper()
	{
		setScriptName("Script2");
	}
	
}

