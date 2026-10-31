package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wlv0 {
    public final uic a;
    public final ip31 b;
    public final ohv0 c;
    public final vlv0 d;

    public wlv0(RetrofitMaker retrofitMaker, uic uicVar, ip31 ip31Var, ohv0 ohv0Var) {
        this.a = uicVar;
        this.b = ip31Var;
        this.c = ohv0Var;
        this.d = (vlv0) retrofitMaker.createWebgateService(vlv0.class, "android-pses-psesimpl");
    }
}
