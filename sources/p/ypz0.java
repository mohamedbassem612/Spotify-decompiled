package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public interface ypz0 {
    @wyq0("radio-apollo/v3/stations")
    Single<Object> a(@u0z0("language") String str, @u0z0("prev_tracks") String str2);

    @wyq0("radio-apollo/v3/stations")
    Completable b(@u0z0("language") String str, @u0z0("send_station") boolean z, @u0z0("count") int i, @elb nqn nqnVar);

    @ay30("radio-apollo/v3/tracks/{stationUri}")
    Single<Object> c(@t8s0("stationUri") String str, @c1z0 Map<String, String> map);

    @ay30("radio-apollo/v3/all?image_style=gradient_overlay")
    Single<Object> d(@u0z0("language") String str);

    @ay30("radio-apollo/v3/stations/{seed}?image_style=gradient_overlay")
    Single<Object> e(@t8s0("seed") String str, @u0z0("count") int i, @c1z0 Map<String, String> map, @dv50("X-Correlation-Id") String str2);
}
