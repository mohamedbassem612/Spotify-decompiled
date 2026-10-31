package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x2s0 {
    public final Scheduler a;
    public final z2s0 b;

    public x2s0(RetrofitMaker retrofitMaker, Scheduler scheduler) {
        this.a = scheduler;
        this.b = (z2s0) retrofitMaker.createWebgateService(z2s0.class, "android-partner-apps-domain");
    }
}
