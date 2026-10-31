package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zfd0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bgd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zfd0(bgd0 bgd0Var, byte b) {
        super(1);
        this.a = b;
        this.b = bgd0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bgd0 bgd0Var = this.b;
        switch (b) {
            case 0:
                ay8 ay8VarH = d3p1.H(bgd0Var.b, bgd0Var.e, (ufd0) obj);
                gal galVar = bgd0Var.d;
                Flowable flowable = (Flowable) galVar.b;
                vbm[] vbmVarArr = q601.a;
                return new x010(ay8VarH, new lt20(new lt20(hu20.e(new lt20(rqt0.u(hu20.c(rqt0.u(new qbk(new kge(flowable), galVar, (byte) 25)), new clo(galVar, (lnm) null, (byte) 2))), new rf2(3, (lnm) null, (byte) 16), (byte) 0), new zz90((lnm) null, bgd0Var, (byte) 10)), new vv70(3, (lnm) null, (byte) 12), (byte) 1), new rf2(3, (lnm) null, (byte) 25), (byte) 0), yfd0.h, (byte) 1);
            default:
                ((qtr) obj).b(new skv(bgd0Var, (lnm) null, (byte) 20));
                return rih1.a;
        }
    }
}
