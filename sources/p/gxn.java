package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lp/gxn;", "", "", "artistId", "Lio/reactivex/rxjava3/core/Single;", "Lp/fxn;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "b", "src_main_java_com_spotify_artist_creatorartist-creatorartist"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface gxn {
    @ay30("creatorabout/v0/artist/{artistId}/about?fields=artist,listenerCount,monthlyListenerRank,isVerified")
    Single<fxn> a(@t8s0("artistId") String artistId);

    @ay30("creatorabout/v0/artist/{artistId}/about?fields=artist,listenerCount,monthlyListenerRank,isVerified,artistFacts")
    Single<fxn> b(@t8s0("artistId") String artistId);
}
