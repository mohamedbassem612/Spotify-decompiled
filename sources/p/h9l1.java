package p;

import com.spotify.watchfeedentrypoints.api.v1.DiscoveryFromSeedResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/h9l1;", "", "", "entityUri", "creatorUri", "contextUri", "", "isTablet", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/watchfeedentrypoints/api/v1/DiscoveryFromSeedResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_watchfeed_npvscrollcard_dataloader-dataloader"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface h9l1 {
    @ay30("watch-feed-entrypoints/v1/discovery-from-seed")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/protobuf"})
    Single<DiscoveryFromSeedResponse> a(@u0z0("entityUri") String entityUri, @u0z0("creatorUri") String creatorUri, @u0z0("contextUri") String contextUri, @u0z0("isTablet") boolean isTablet);
}
