package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lyo implements fgi0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ lyo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final rgi0 b(Function0 function0, ymd0 ymd0Var, kko kkoVar, p731 p731Var, uei0 uei0Var, cgi0 cgi0Var, Function0 function1, hs00 hs00Var, mgi0 mgi0Var, ngi0 ngi0Var, yih0 yih0Var, ojv0 ojv0Var, bpb1 bpb1Var) {
        byte b = this.a;
        d7p d7pVar = this.b;
        switch (b) {
            case 0:
                zl5 zl5Var = (zl5) ((fwo) d7pVar).c;
                return new rgi0((vei0) ((jly0) zl5Var.v).get(), (fci0) ((jly0) zl5Var.w).get(), (fwo) zl5Var.u, new jxa((byte) 16, false), new yy4((luk) ((ib3) zl5Var.b).g), ymd0Var, function0, kkoVar, p731Var, uei0Var, cgi0Var, function1, hs00Var, mgi0Var, ngi0Var, yih0Var, ojv0Var, bpb1Var);
            case 1:
                s3p s3pVar = (s3p) ((b2p) d7pVar).c;
                vei0 vei0Var = (vei0) ((jly0) s3pVar.S0).get();
                fci0 fci0Var = (fci0) ((jly0) s3pVar.T0).get();
                b2p b2pVar = (b2p) s3pVar.s1;
                jxa jxaVar = new jxa((byte) 16, false);
                luk lukVar = (luk) ((i7c) s3pVar.X0).m.get();
                c8o.l(lukVar);
                return new rgi0(vei0Var, fci0Var, b2pVar, jxaVar, new yy4(lukVar), ymd0Var, function0, kkoVar, p731Var, uei0Var, cgi0Var, function1, hs00Var, mgi0Var, ngi0Var, yih0Var, ojv0Var, bpb1Var);
            case 2:
                e1o e1oVar = (e1o) d7pVar.c;
                vei0 vei0Var2 = (vei0) ((jly0) e1oVar.E).get();
                fci0 fci0Var2 = (fci0) ((jly0) e1oVar.F).get();
                d7p d7pVar2 = (d7p) e1oVar.D;
                jxa jxaVar2 = new jxa((byte) 16, false);
                luk lukVar2 = (luk) ((mjk) e1oVar.a).k.get();
                c8o.l(lukVar2);
                return new rgi0(vei0Var2, fci0Var2, d7pVar2, jxaVar2, new yy4(lukVar2), ymd0Var, function0, kkoVar, p731Var, uei0Var, cgi0Var, function1, hs00Var, mgi0Var, ngi0Var, yih0Var, ojv0Var, bpb1Var);
            default:
                f9p f9pVar = (f9p) d7pVar.c;
                return new rgi0((vei0) ((jly0) f9pVar.e).get(), (fci0) ((jly0) f9pVar.f).get(), (d7p) f9pVar.Z0, new jxa((byte) 16, false), f9pVar.c(), ymd0Var, function0, kkoVar, p731Var, uei0Var, cgi0Var, function1, hs00Var, mgi0Var, ngi0Var, yih0Var, ojv0Var, bpb1Var);
        }
    }
}
