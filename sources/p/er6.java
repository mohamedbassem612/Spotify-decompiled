package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class er6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er6(bs0 bs0Var, byte b) {
        super(1);
        this.a = b;
        this.b = bs0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bs0 bs0Var = this.b;
        switch (b) {
            case 0:
                km3 km3Var = (km3) bs0Var.d;
                return ((roc0) ((koc0) km3Var.b)).e().map(vgp1.g).filter(zp8.i).distinctUntilChanged().switchMap(new a42(km3Var, (byte) 24)).map(rbc.i).toFlowable(BackpressureStrategy.d);
            case 1:
                z2s z2sVar = (z2s) obj;
                wzn wznVar = (wzn) ((b0p) bs0Var.b).a.c;
                lzn0 lzn0Var = (lzn0) ((lzp) wznVar.b).a.i.get();
                c8o.l(lzn0Var);
                xfx xfxVar = (xfx) ((lzp) wznVar.b).a.q1.get();
                c8o.l(xfxVar);
                z2sVar.R(ss6.class, new rt01(lzn0Var, new pp(xfxVar.c, (byte) 14)), gn6.V0, gn6.W0, gn6.X0, false, ad5.R0);
                return rih1Var;
            default:
                o4o1.o((y2s) obj, (kdn0) bs0Var.e, new er6(bs0Var, (byte) 1));
                return rih1Var;
        }
    }
}
