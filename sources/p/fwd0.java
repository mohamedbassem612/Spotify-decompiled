package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fwd0 extends hab0 implements vu30 {
    public final /* synthetic */ gwd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwd0(gwd0 gwd0Var) {
        super(2);
        this.a = gwd0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ld80 ld80Var = this.a.b;
        vhc vhcVar = ld80Var.a;
        kd80 kd80Var = new kd80();
        Scheduler scheduler = ld80Var.d;
        tr41 tr41Var = ld80Var.e;
        f5b f5bVar = ld80Var.k;
        tr41 tr41Var2 = ld80Var.m;
        bk1 bk1Var = ld80Var.f;
        yx11 yx11Var = ld80Var.g;
        fyy0 fyy0Var = ld80Var.h;
        fyy0 fyy0Var2 = ld80Var.i;
        final hod0 hod0Var = ld80Var.j;
        yx11 yx11Var2 = ld80Var.l;
        qg7 qg7Var = ld80Var.n;
        f5b f5bVar2 = ld80Var.o;
        ye11 ye11Var = ld80Var.f16p;
        nm3 nm3Var = ld80Var.q;
        bk1 bk1Var2 = ld80Var.r;
        ye11 ye11Var2 = ld80Var.s;
        hi1 hi1Var = ld80Var.t;
        lzn0 lzn0Var = ld80Var.u;
        kt91 kt91Var = ld80Var.v;
        rzd0 rzd0Var = ld80Var.w;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.d(bxd0.class, tr41Var, scheduler);
        subtypeEffectHandlerBuilderC.d(axd0.class, f5bVar, scheduler);
        subtypeEffectHandlerBuilderC.d(jxd0.class, tr41Var2, scheduler);
        subtypeEffectHandlerBuilderC.d(oxd0.class, qg7Var, scheduler);
        subtypeEffectHandlerBuilderC.d(zwd0.class, f5bVar2, scheduler);
        subtypeEffectHandlerBuilderC.d(uwd0.class, hi1Var, scheduler);
        subtypeEffectHandlerBuilderC.g(ixd0.class, yx11Var2);
        subtypeEffectHandlerBuilderC.g(vwd0.class, bk1Var);
        subtypeEffectHandlerBuilderC.g(hxd0.class, yx11Var);
        subtypeEffectHandlerBuilderC.g(pxd0.class, fyy0Var);
        subtypeEffectHandlerBuilderC.g(qxd0.class, fyy0Var2);
        final byte b = 0;
        subtypeEffectHandlerBuilderC.g(dxd0.class, new ObservableTransformer() { // from class: p.sxd0
            public final ObservableSource apply(Observable observable) {
                byte b2 = b;
                hod0 hod0Var2 = hod0Var;
                switch (b2) {
                    case 0:
                        return observable.flatMapSingle(new ruc0(hod0Var2, (byte) 4));
                    default:
                        return observable.switchMap(new jl00(hod0Var2, (byte) 29));
                }
            }
        });
        final byte b2 = 1;
        subtypeEffectHandlerBuilderC.g(cxd0.class, new ObservableTransformer() { // from class: p.sxd0
            public final ObservableSource apply(Observable observable) {
                byte b3 = b2;
                hod0 hod0Var2 = hod0Var;
                switch (b3) {
                    case 0:
                        return observable.flatMapSingle(new ruc0(hod0Var2, (byte) 4));
                    default:
                        return observable.switchMap(new jl00(hod0Var2, (byte) 29));
                }
            }
        });
        subtypeEffectHandlerBuilderC.g(fxd0.class, ye11Var);
        subtypeEffectHandlerBuilderC.g(exd0.class, nm3Var);
        subtypeEffectHandlerBuilderC.g(xwd0.class, bk1Var2);
        subtypeEffectHandlerBuilderC.g(gxd0.class, ye11Var2);
        subtypeEffectHandlerBuilderC.b(ywd0.class, new g5b(lzn0Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.b(wwd0.class, new g5b(lzn0Var, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.d(kxd0.class, new txd0(kt91Var, rzd0Var, hi1Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(lxd0.class, new txd0(kt91Var, rzd0Var, hi1Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(nxd0.class, new w090(rzd0Var, kt91Var, (byte) 9), scheduler);
        subtypeEffectHandlerBuilderC.d(mxd0.class, new w090(rzd0Var, tr41Var2, (byte) 10), scheduler);
        return Mobius.d(kd80Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).f(ld80Var.b).i(ld80Var.c);
    }
}
