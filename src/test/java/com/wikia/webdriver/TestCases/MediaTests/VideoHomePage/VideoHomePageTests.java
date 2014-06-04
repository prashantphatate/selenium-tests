package com.wikia.webdriver.TestCases.MediaTests.VideoHomePage;

import org.testng.annotations.Test;

import com.wikia.webdriver.Common.Templates.NewTestTemplate;
import com.wikia.webdriver.PageObjectsFactory.PageObject.WikiBasePageObject;
import com.wikia.webdriver.PageObjectsFactory.PageObject.VideoHomePageObject;
import com.wikia.webdriver.Common.ContentPatterns.URLsContent;

/**
 * Created by Liz Lee on 6/4/14.
 */
public class VideoHomePageTests extends NewTestTemplate {
	@Test(groups = {"VideoHomePage_001", "Media", "VideoHomePageTests"})
	public void VideoHomePage_001_FeaturedVideoSlider() {
		WikiBasePageObject base = new WikiBasePageObject(driver);
		String wikiURL = urlBuilder.getUrlForWiki(URLsContent.videoTestWiki);
		VideoHomePageObject videoHomePageObject = base.openVideoHomePageObject(wikiURL);
		videoHomePageObject.verifyFeaturedSliderInitialized();

	}

	@Test(groups = {"VideoHomePage_002", "Media", "VideoHomePageTests"})
	public void VideoHomePage_002_LatestVideos() {
		WikiBasePageObject base = new WikiBasePageObject(driver);
		String wikiURL = urlBuilder.getUrlForWiki(URLsContent.videoTestWiki);
		VideoHomePageObject videoHomePageObject = base.openVideoHomePageObject(wikiURL);
		videoHomePageObject.verifyLatestVideosRendered();

	}

}
