package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\n\u0010\u000bJO\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/r310;", "", "", "", "cacheHeaders", "iso8601ClientDateTime", "externalIntegrationRequestModelJson", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lp/q310;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "genreUri", "b", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_externalintegration_http-http"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface r310 {
    @ay30("external-integration-browse/v1/get-browse-root")
    Single<sy21<q310>> a(@o160 Map<String, String> cacheHeaders, @dv50("x-timestamp") String iso8601ClientDateTime, @u0z0("request_json") String externalIntegrationRequestModelJson);

    @ay30("external-integration-browse/v1/get-browse-content")
    Single<sy21<q310>> b(@o160 Map<String, String> cacheHeaders, @dv50("x-timestamp") String iso8601ClientDateTime, @u0z0("genre_uri") String genreUri, @u0z0("request_json") String externalIntegrationRequestModelJson);
}
