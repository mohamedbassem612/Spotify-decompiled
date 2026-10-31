package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pep {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ pep(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final b9z a(Function0 function0, yzc0 yzc0Var, lik1 lik1Var) {
        byte b = this.a;
        ipq ipqVar = this.b;
        switch (b) {
            case 0:
                c21 c21Var = (c21) ((lbp) ipqVar).c;
                f1n0 f1n0Var = (f1n0) ((nzp) c21Var.d).b.T2.get();
                c8o.l(f1n0Var);
                vgm vgmVar = (vgm) ((nzp) c21Var.d).b.b.E.get();
                c8o.l(vgmVar);
                return new b9z(f1n0Var, vgmVar, function0, yzc0Var, lik1Var);
            default:
                hqq hqqVar = (hqq) ipqVar.c;
                f1n0 f1n0Var2 = (f1n0) hqqVar.a.x.get();
                c8o.l(f1n0Var2);
                vgm vgmVar2 = (vgm) hqqVar.a.L0.get();
                c8o.l(vgmVar2);
                return new b9z(f1n0Var2, vgmVar2, function0, yzc0Var, lik1Var);
        }
    }
}
