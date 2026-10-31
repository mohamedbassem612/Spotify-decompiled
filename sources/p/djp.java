package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class djp {
    public final yc00 a;

    public djp(yc00 yc00Var) {
        this.a = yc00Var;
    }

    public final bza0 a() {
        yc00 yc00Var = this.a;
        return new bza0((iza0) ((RetrofitMaker) yc00Var.a.get()).createWebgateService(iza0.class, "android-genalpha-datasourceimpl"), (iwe0) yc00Var.b.get(), (g8h1) yc00Var.c.get(), ((Boolean) yc00Var.g.get()).booleanValue(), (z6r0) yc00Var.d.get());
    }
}
