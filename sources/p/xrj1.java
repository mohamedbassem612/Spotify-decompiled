package p;

import com.spotify.cosmos.cosmonaut.CosmosService;
import com.spotify.cosmos.cosmonaut.annotations.Body;
import com.spotify.cosmos.cosmonaut.annotations.SUB;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@CosmosService
public interface xrj1 {
    @SUB("sp://videoplayer/v1/commands")
    Observable<srj1> a(@Body wrj1 wrj1Var);
}
