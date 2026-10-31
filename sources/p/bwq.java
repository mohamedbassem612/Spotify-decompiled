package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public interface bwq {
    @ay30("dailymix/v5/dailymix_tracks/{stationUri}")
    Single<Object> a(@t8s0("stationUri") String str, @c1z0 Map<String, String> map);

    @ay30("dailymix/v5/dailymix_stations/{seed}?image_style=gradient_overlay")
    Single<Object> b(@t8s0("seed") String str, @u0z0("count") int i, @c1z0 Map<String, String> map);
}
