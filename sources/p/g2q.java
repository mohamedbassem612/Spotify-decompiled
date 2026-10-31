package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g2q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ g2q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public static jb3 a(g2q g2qVar, i8h1 i8h1Var, muz muzVar, epb1 epb1Var, tgt0 tgt0Var, gn10 gn10Var, iu30 iu30Var, lik1 lik1Var, iac0 iac0Var, Function0 function0, Function0 function1, kko kkoVar, mr20 mr20Var, guj1 guj1Var, int i) {
        kko kkoVar2 = (i & 1024) != 0 ? null : kkoVar;
        mr20 mr20Var2 = (i & 2048) != 0 ? null : mr20Var;
        switch (g2qVar.a) {
            case 0:
                i2q i2qVar = (i2q) g2qVar.b;
                teq teqVar = i2qVar.b;
                return new jb3((s5q) teqVar.zc.get(), teqVar.Ac, (t5q) teqVar.Bc.get(), (a3u0) teqVar.Cc.get(), (h5q) teqVar.db.get(), (h2q) i2qVar.c.g1.get(), i8h1Var, epb1Var, muzVar, function1, tgt0Var, gn10Var, iu30Var, lik1Var, function0, iac0Var, kkoVar2, mr20Var2, guj1Var);
            case 1:
                v5q v5qVar = (v5q) ((thq) g2qVar.b).c;
                return new jb3((s5q) v5qVar.e9.get(), v5qVar.f9, (t5q) v5qVar.g9.get(), (a3u0) v5qVar.h9.get(), (h5q) v5qVar.J7.get(), (h2q) v5qVar.i9.get(), i8h1Var, epb1Var, muzVar, function1, tgt0Var, gn10Var, iu30Var, lik1Var, function0, iac0Var, kkoVar2, mr20Var2, guj1Var);
            default:
                teq teqVar2 = ((thq) g2qVar.b).c;
                return new jb3((s5q) teqVar2.zc.get(), teqVar2.Ac, (t5q) teqVar2.Bc.get(), (a3u0) teqVar2.Cc.get(), (h5q) teqVar2.db.get(), (h2q) teqVar2.b.W.get(), i8h1Var, epb1Var, muzVar, function1, tgt0Var, gn10Var, iu30Var, lik1Var, function0, iac0Var, kkoVar2, mr20Var2, guj1Var);
        }
    }
}
