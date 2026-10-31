package p;

import com.spotify.cosmos.cosmonaut.CosmosService;
import com.spotify.cosmos.cosmonaut.annotations.Body;
import com.spotify.cosmos.cosmonaut.annotations.GET;
import com.spotify.cosmos.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.cosmos.Response;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@CosmosService
public interface nhh1 {
    @GET("sp://core-show/unstable/unfinished/episodes")
    Single<Response> a(@QueryMap Map<String, String> map, @Body uav0 uav0Var);
}
