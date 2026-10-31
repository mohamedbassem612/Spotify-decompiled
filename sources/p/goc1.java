package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/goc1;", "", "Lp/kud0;", "setRequest", "Lio/reactivex/rxjava3/core/Single;", "a", "(Lp/kud0;)Lio/reactivex/rxjava3/core/Single;", "b", "src_main_java_com_spotify_liveroom_livestreampagefragment-livestreampagefragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface goc1 {
    @u360({"Content-Type: application/json", "Accept: application/json"})
    @wyq0("live-stream-insights/v1/subscribe")
    Single<Object> a(@elb kud0 setRequest);

    @u360({"Content-Type: application/json", "Accept: application/json"})
    @wyq0("live-stream-insights/v1/unsubscribe")
    Single<Object> b(@elb kud0 setRequest);
}
