package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/mfz0;", "", "Lio/reactivex/rxjava3/core/Single;", "Lp/tl51;", "a", "()Lio/reactivex/rxjava3/core/Single;", "c", "b", "src_main_java_com_spotify_quickplay_quickplay-quickplay"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface mfz0 {
    @ay30("topic-mix/lists/v1/shelf-uris/genre?userRanked=true&response-format=json")
    Single<tl51> a();

    @ay30("topic-mix/lists/v1/shelf-uris/decade?userRanked=true&response-format=json")
    Single<tl51> b();

    @ay30("topic-mix/lists/v1/shelf-uris/artist?userRanked=true&response-format=json")
    Single<tl51> c();
}
