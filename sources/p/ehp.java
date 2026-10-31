package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ehp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ ehp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final uo31 a(String str, s4b1 s4b1Var) {
        byte b = this.a;
        chp chpVar = this.b;
        switch (b) {
            case 0:
                ghp ghpVar = (ghp) chpVar.c;
                Context contextB = ghpVar.a.b();
                ut71 ut71Var = (ut71) ghpVar.a.t.get();
                b410 b410Var = ghpVar.a;
                return new uo31(contextB, ut71Var, new evm1((luk) b410Var.s0.get()), (j7c0) b410Var.C0.get(), str, s4b1Var);
            case 1:
                fip fipVar = (fip) chpVar.c;
                Context context = fipVar.b.context();
                c8o.l(context);
                ut71 ut71VarY = fipVar.b.y();
                c8o.l(ut71VarY);
                evm1 evm1VarI = fipVar.i();
                j7c0 j7c0VarE = fipVar.b.E();
                c8o.l(j7c0VarE);
                return new uo31(context, ut71VarY, evm1VarI, j7c0VarE, str, s4b1Var);
            default:
                lvq lvqVar = (lvq) ((tsq) chpVar).c;
                Context context2 = lvqVar.b.context();
                c8o.l(context2);
                ut71 ut71VarY2 = lvqVar.b.y();
                c8o.l(ut71VarY2);
                evm1 evm1VarN = lvqVar.n();
                j7c0 j7c0VarE2 = lvqVar.b.E();
                c8o.l(j7c0VarE2);
                return new uo31(context2, ut71VarY2, evm1VarN, j7c0VarE2, str, s4b1Var);
        }
    }
}
