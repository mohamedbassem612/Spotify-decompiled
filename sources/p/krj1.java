package p;

import com.spotify.betamax.contextplayercoordinatorimpl.model.VideoPlayerCommand;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmonaut.CosmosService;
import com.spotify.cosmos.cosmonaut.annotations.Body;
import com.spotify.cosmos.cosmonaut.annotations.POST;
import com.spotify.cosmos.cosmonaut.annotations.SUB;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@CosmosService
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lp/krj1;", "", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/betamax/contextplayercoordinatorimpl/model/VideoPlayerCommand;", "b", "()Lio/reactivex/rxjava3/core/Observable;", "Lp/crj1;", "reason", "Lio/reactivex/rxjava3/core/Completable;", "d", "(Lp/crj1;)Lio/reactivex/rxjava3/core/Completable;", "Lp/xau0;", "playerError", "c", "(Lp/xau0;)Lio/reactivex/rxjava3/core/Completable;", "Lp/zcu0;", "playerState", "a", "(Lp/zcu0;)Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_betamax_contextplayercoordinatorimpl-contextplayercoordinatorimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface krj1 {
    @POST("sp://videoplayer/v1/state")
    Completable a(@Body zcu0 playerState);

    @SUB("sp://videoplayer/v1/commands")
    Observable<VideoPlayerCommand> b();

    @POST("sp://videoplayer/v1/error")
    Completable c(@Body xau0 playerError);

    @POST("sp://videoplayer/v1/advance")
    Completable d(@Body crj1 reason);
}
