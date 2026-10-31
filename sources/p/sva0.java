package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sva0 implements h0r0 {
    public final lo5 a;
    public final swa0 b;
    public final ic9 c;
    public final Scheduler d;
    public final nwa e;
    public final jwa f;

    public sva0(gx81 gx81Var, lo5 lo5Var, swa0 swa0Var, ic9 ic9Var, Scheduler scheduler, nwa nwaVar, jwa jwaVar) {
        this.a = lo5Var;
        this.b = swa0Var;
        this.c = ic9Var;
        this.d = scheduler;
        this.e = nwaVar;
        this.f = jwaVar;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        jwa jwaVar = this.f;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(xyn1.v(jwaVar.a()), xyn1.x(jwaVar.a()), (nar0) null), new ktl1(32)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        ObservableTransformer iwaVar = new iwa(this.e, (byte) 0);
        xzf xzfVar = new xzf(this.b, this.c, (byte) 3);
        drm1 drm1Var = new drm1((byte) 24);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(kva0.class, iwaVar);
        subtypeEffectHandlerBuilderC.d(lva0.class, new od30(xzfVar, (byte) 29), this.d);
        return gx81.a(new hu90(this, (byte) 15), new dx81(new rva0(Mobius.d(drm1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))), jqa0.e, new fza((byte) 14)));
    }
}
