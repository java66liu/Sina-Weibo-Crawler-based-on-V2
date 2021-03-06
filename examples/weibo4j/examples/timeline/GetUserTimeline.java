package weibo4j.examples.timeline;

import java.util.List;

import weibo4j.Timeline;
import weibo4j.Weibo;
import weibo4j.examples.Log;
import weibo4j.model.Paging;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;

public class GetUserTimeline {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String access_token = args[0];
		String access_token = "bc2a9b7eae843e903f05862136d50102";

		Weibo weibo = new Weibo();
		weibo.setToken(access_token);
		Timeline tm = new Timeline();
		try {
			//List<Status> status = tm.getUserTimeline(access_token);
			Paging pag = new Paging();
			pag.setPage(1);
			List<Status> status = tm.getUserTimeline("2093492691", "",
					50, pag, 0, 0);
			for(Status s : status){
				Log.logInfo(s.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
