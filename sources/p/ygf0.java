package p;

import com.spotify.lyrics.serviceretrofit.proto.ColorLyricsResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lp/ygf0;", "", "", "trackId", "", "vocalRemoval", "clientLanguage", "isPreview", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/lyrics/serviceretrofit/proto/ColorLyricsResponse;", "a", "(Ljava/lang/String;ZLjava/lang/String;Z)Lio/reactivex/rxjava3/core/Single;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_lyrics_serviceretrofit-serviceretrofit"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface ygf0 {
    @ay30("color-lyrics/v2/track/{trackId}")
    @u360({"Accept: application/protobuf"})
    Single<ColorLyricsResponse> a(@t8s0("trackId") String trackId, @u0z0("vocalRemoval") boolean vocalRemoval, @u0z0("clientLanguage") String clientLanguage, @u0z0("preview") boolean isPreview);

    @ay30("color-lyrics/v2/download/track/{trackId}")
    @u360({"Accept: application/protobuf"})
    Single<ColorLyricsResponse> b(@t8s0("trackId") String trackId, @u0z0("clientLanguage") String clientLanguage);
}
