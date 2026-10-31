package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yq0 {
    public final pxc a;
    public final Flowable b;
    public final Scheduler c;
    public final yqg d;
    public final qq0 e;
    public final Flowable f;
    public final g0l g;
    public final gw70 h;

    public yq0(pxc pxcVar, Flowable flowable, Scheduler scheduler, yqg yqgVar, qq0 qq0Var, Flowable flowable2, g0l g0lVar, gw70 gw70Var) {
        this.a = pxcVar;
        this.b = flowable;
        this.c = scheduler;
        this.d = yqgVar;
        this.e = qq0Var;
        this.f = flowable2;
        this.g = g0lVar;
        this.h = gw70Var;
    }

    public final br0 a(uq0 uq0Var) {
        tq0 tq0Var = uq0Var.a;
        if (tq0Var instanceof rq0) {
            g0l g0lVar = this.g;
            qq0 qq0Var = this.e;
            Flowable flowable = this.b;
            mr20 mr20VarB = acq0.B(g0lVar, flowable, qq0Var);
            vbm[] vbmVarArr = q601.a;
            return new br0(new x010(mr20VarB, new kge((moy0) this.f), new xq0(3, this, yq0.class, "toExternalState", "toExternalState(Lcom/spotify/adsdisplay/elementimpl/ktx/ConnectState;Lcom/spotify/adsinternal/adscommon/adsinfoprovider/AdsNowPlayingInfo;)Lcom/spotify/adsdisplay/elementimpl/inforow/AdInfoRowElementImpl$ExternalState;", 4, (byte) 0), (byte) 1), f3o1.t(flowable, this.c, this.d), this.a, this.h, false, (xj0) null, p4.X);
        }
        if (!(tq0Var instanceof sq0)) {
            eg.o();
            return null;
        }
        sq0 sq0Var = (sq0) tq0Var;
        ji0 ji0Var = sq0Var.a;
        return new br0(new huz(new wq0(ji0Var, ji0Var.U0, ji0Var.c, (String) null, p2o1.r(ji0Var)), (byte) 10), sq0Var.b, this.a, this.h, sq0Var.c, sq0Var.d, p4.Y);
    }
}
