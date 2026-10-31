package p;

import com.spotify.cosmos.cosmonaut.CosmosService;
import com.spotify.cosmos.cosmonaut.annotations.Body;
import com.spotify.cosmos.cosmonaut.annotations.GET;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lp/u3v0;", "", "", "", "queryParams", "Lp/s3v0;", "body", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/cosmos/cosmos/Response;", "b", "(Ljava/util/Map;Lp/s3v0;)Lio/reactivex/rxjava3/core/Single;", "Lio/reactivex/rxjava3/core/Observable;", "a", "(Ljava/util/Map;Lp/s3v0;)Lio/reactivex/rxjava3/core/Observable;", "src_main_java_com_spotify_podcast_endpointsimpl-endpointsimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface u3v0 {
    @SUB("sp://core-show/unstable/decorate")
    Observable<Response> a(@QueryMap Map<String, String> queryParams, @Body s3v0 body);

    @GET("sp://core-show/unstable/decorate")
    Single<Response> b(@QueryMap Map<String, String> queryParams, @Body s3v0 body);
}
