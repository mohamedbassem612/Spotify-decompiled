package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qcc implements o5s {
    public final /* synthetic */ rcc a;
    public final /* synthetic */ ipb1 b;
    public final /* synthetic */ mc41 c;
    public final /* synthetic */ Object d;

    public qcc(rcc rccVar, ipb1 ipb1Var, mc41 mc41Var, Object obj) {
        this.a = rccVar;
        this.b = ipb1Var;
        this.c = mc41Var;
        this.d = obj;
    }

    @Override // p.o5s
    public final void onCreate(iac0 iac0Var) {
        rcc rccVar = this.a;
        oe41 oe41Var = rccVar.c;
        String str = rccVar.b;
        if (oe41Var.b(str) != null) {
            oe41Var.e(str);
        }
        ipb1 ipb1Var = this.b;
        mc41 mc41Var = this.c;
        oe41Var.c(str, new pcc(ipb1Var, mc41Var));
        Bundle bundleA = oe41Var.a(str);
        if (bundleA != null) {
            k1o1.s(bundleA, this.d, ipb1Var, mc41Var);
        }
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        rcc rccVar = this.a;
        rccVar.c.e(rccVar.b);
    }
}
