package p;

import com.spotify.highlightsstats.data.proto.sharing.v1.ShareHighlightRequest;
import com.spotify.highlightsstats.data.proto.sharing.v1.ShareResponse;
import com.spotify.highlightsstats.data.proto.sharing.v1.ShareStatsRequest;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.StatsDetailsRequest;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.StatsDetailsResponse;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserTimelineRequest;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserTimelineResponse;
import com.spotify.highlightsstats.data.proto.v2.HighlightsListRequest;
import com.spotify.highlightsstats.data.proto.v2.HighlightsListResponse;
import com.spotify.highlightsstats.data.proto.v2.StatsDetailsIntervalRequest;
import com.spotify.highlightsstats.data.proto.v2.SummaryIntervalRequest;
import com.spotify.highlightsstats.data.proto.v2.SummaryRequest;
import com.spotify.highlightsstats.data.proto.v2.SummaryResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\"H'¢\u0006\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lp/qf60;", "", "Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/UserTimelineRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/UserTimelineResponse;", "a", "(Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/UserTimelineRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/v2/SummaryRequest;", "Lcom/spotify/highlightsstats/data/proto/v2/SummaryResponse;", "e", "(Lcom/spotify/highlightsstats/data/proto/v2/SummaryRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/highlightsstats/data/proto/v2/SummaryIntervalRequest;", "i", "(Lcom/spotify/highlightsstats/data/proto/v2/SummaryIntervalRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/StatsDetailsRequest;", "Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/StatsDetailsResponse;", "c", "(Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/StatsDetailsRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/v2/HighlightsListRequest;", "Lcom/spotify/highlightsstats/data/proto/v2/HighlightsListResponse;", "h", "(Lcom/spotify/highlightsstats/data/proto/v2/HighlightsListRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/highlightsstats/data/proto/v2/StatsDetailsRequest;", "Lcom/spotify/highlightsstats/data/proto/v2/StatsDetailsResponse;", "f", "(Lcom/spotify/highlightsstats/data/proto/v2/StatsDetailsRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/v2/StatsDetailsIntervalRequest;", "g", "(Lcom/spotify/highlightsstats/data/proto/v2/StatsDetailsIntervalRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareHighlightRequest;", "Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareResponse;", "b", "(Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareHighlightRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareStatsRequest;", "d", "(Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareStatsRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_highlightsstats_data-data"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface qf60 {
    @u360({"content-type: application/x-protobuf"})
    @wyq0("/spotify.highlightsandstatsview.v1.HighlightsAndStatsViewService/UserTimeline")
    Single<UserTimelineResponse> a(@elb UserTimelineRequest request);

    @u360({"content-type: application/x-protobuf"})
    @wyq0("/highlights-and-stats-sharing/v2/share_highlight")
    Single<ShareResponse> b(@elb ShareHighlightRequest request);

    @u360({"content-type: application/x-protobuf"})
    @wyq0("/spotify.highlightsandstatsview.v1.HighlightsAndStatsViewService/StatsDetails")
    Single<StatsDetailsResponse> c(@elb StatsDetailsRequest request);

    @u360({"content-type: application/x-protobuf"})
    @wyq0("/highlights-and-stats-sharing/v2/share_stats")
    Single<ShareResponse> d(@elb ShareStatsRequest request);

    @u360({"content-type: application/x-protobuf"})
    @wyq0("/spotify.highlightsandstatsview.v2.HighlightsAndStatsViewService/Summary")
    Object e(@elb SummaryRequest summaryRequest, lnm<? super SummaryResponse> lnmVar);

    @u360({"content-type: application/x-protobuf"})
    @wyq0("/spotify.highlightsandstatsview.v2.HighlightsAndStatsViewService/StatsDetails")
    Single<com.spotify.highlightsstats.data.proto.v2.StatsDetailsResponse> f(@elb com.spotify.highlightsstats.data.proto.v2.StatsDetailsRequest request);

    @u360({"content-type: application/x-protobuf"})
    @wyq0("/spotify.highlightsandstatsview.v2.HighlightsAndStatsViewService/StatsDetailsInterval")
    Object g(@elb StatsDetailsIntervalRequest statsDetailsIntervalRequest, lnm<? super com.spotify.highlightsstats.data.proto.v2.StatsDetailsResponse> lnmVar);

    @u360({"content-type: application/x-protobuf"})
    @wyq0("/spotify.highlightsandstatsview.v2.HighlightsAndStatsViewService/HighlightsList")
    Object h(@elb HighlightsListRequest highlightsListRequest, lnm<? super HighlightsListResponse> lnmVar);

    @u360({"content-type: application/x-protobuf"})
    @wyq0("/spotify.highlightsandstatsview.v2.HighlightsAndStatsViewService/SummaryInterval")
    Object i(@elb SummaryIntervalRequest summaryIntervalRequest, lnm<? super SummaryResponse> lnmVar);
}
