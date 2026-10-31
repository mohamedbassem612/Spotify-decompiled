package p;

import com.spotify.concertview.concertfeedview.v1.GetConceptsRequest;
import com.spotify.concertview.concertfeedview.v1.GetConceptsResponse;
import com.spotify.concertview.concertfeedview.v1.GetFeedNextPageRequest;
import com.spotify.concertview.concertfeedview.v1.GetFeedNextPageResponse;
import com.spotify.concertview.concertfeedview.v1.GetFeedRequest;
import com.spotify.concertview.concertfeedview.v1.GetFeedResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/wlk;", "", "Lcom/spotify/concertview/concertfeedview/v1/GetConceptsRequest;", "request", "Lcom/spotify/concertview/concertfeedview/v1/GetConceptsResponse;", "b", "(Lcom/spotify/concertview/concertfeedview/v1/GetConceptsRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/concertview/concertfeedview/v1/GetFeedRequest;", "Lcom/spotify/concertview/concertfeedview/v1/GetFeedResponse;", "a", "(Lcom/spotify/concertview/concertfeedview/v1/GetFeedRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/concertview/concertfeedview/v1/GetFeedNextPageRequest;", "Lcom/spotify/concertview/concertfeedview/v1/GetFeedNextPageResponse;", "c", "(Lcom/spotify/concertview/concertfeedview/v1/GetFeedNextPageRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_liveevents_datasource-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface wlk {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("concert-feed-view/spotify.concertview.concertfeedview.v1.ConcertFeedViewService/GetFeed")
    Object a(@elb GetFeedRequest getFeedRequest, lnm<? super GetFeedResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("concert-feed-view/spotify.concertview.concertfeedview.v1.ConcertFeedViewService/GetConcepts")
    Object b(@elb GetConceptsRequest getConceptsRequest, lnm<? super GetConceptsResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("concert-feed-view/spotify.concertview.concertfeedview.v1.ConcertFeedViewService/GetFeedNextPage")
    Object c(@elb GetFeedNextPageRequest getFeedNextPageRequest, lnm<? super GetFeedNextPageResponse> lnmVar);
}
