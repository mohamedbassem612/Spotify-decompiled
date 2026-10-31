package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/k1y;", "", "", "stationName", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lp/h4c0;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "setTag", "Lp/r4c0;", "b", "src_main_java_com_spotify_endless_playerimpl-playerimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface k1y {
    @ay30("endless-api/v1/session/resolve")
    @u360({"Content-Type: application/json", "Accept: application/json"})
    Single<sy21<h4c0>> a(@u0z0("station") String stationName);

    @u360({"Content-Type: application/json", "Accept: application/json"})
    @wyq0("lexicon-session-provider/sessions")
    Single<sy21<r4c0>> b(@u0z0("setTag") String setTag);
}
