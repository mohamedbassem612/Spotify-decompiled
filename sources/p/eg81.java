package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eg81 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dea0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg81(dea0 dea0Var, byte b) {
        super(1);
        this.a = b;
        this.b = dea0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dea0 dea0Var = this.b;
        switch (b) {
            case 0:
                p811 p811Var = new p811();
                ezc ezcVarG = yoi1.g((Observable) dea0Var.f);
                iib iibVar = new iib(new fu20(new ht20(((bfd) dea0Var.g).A(), new dg81(dea0Var, (lnm) null, (byte) 0)), new i3y0(p811Var, dea0Var, (lnm) null, (byte) 28), (byte) 1), new bu51(dea0Var, (lnm) null, (byte) 5), (byte) 6);
                gqo0 gqo0Var = (gqo0) dea0Var.Z;
                gqo0Var.getClass();
                return h5p1.s(ezcVarG, iibVar, new ht20(gqo0Var.k(gqo0.r, new dqo0(gqo0Var, null, (byte) 2)), new egv0(2, (lnm) null, (byte) 19)), new eko(4, (lnm) null, (byte) 1));
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.d(oa81.R0, yd81.h);
                qtrVar.b(new f3(qtrVar, dea0Var, null, (byte) 25));
                return rih1.a;
        }
    }
}
