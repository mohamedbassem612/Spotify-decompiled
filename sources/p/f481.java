package p;

import com.spotify.cosmos.cosmonaut.CosmosService;
import com.spotify.cosmos.cosmonaut.annotations.Body;
import com.spotify.cosmos.cosmonaut.annotations.GET;
import com.spotify.cosmos.cosmonaut.annotations.Path;
import com.spotify.cosmos.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.cosmonaut.annotations.SUB;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@CosmosService
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lp/f481;", "", "", "showId", "", "queryParams", "Lp/t881;", "policy", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/cosmos/Response;", "b", "(Ljava/lang/String;Ljava/util/Map;Lp/t881;)Lio/reactivex/rxjava3/core/Observable;", "Lio/reactivex/rxjava3/core/Single;", "c", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/Single;", "a", "(Ljava/lang/String;Ljava/util/Map;Lp/t881;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_podcast_endpointsimpl-endpointsimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface f481 {
    @GET("sp://core-show/v1/shows/{showId}")
    Single<Response> a(@Path("showId") String showId, @QueryMap Map<String, String> queryParams, @Body t881 policy);

    @SUB("sp://core-show/v1/shows/{showId}")
    Observable<Response> b(@Path("showId") String showId, @QueryMap Map<String, String> queryParams, @Body t881 policy);

    @GET("sp://core-show/v1/shows/{showId}")
    Single<Response> c(@Path("showId") String showId, @QueryMap Map<String, String> queryParams);
}
