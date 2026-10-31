package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pki1 {
    public final add a;
    public final pni1 b;

    public pki1(add addVar, pni1 pni1Var) {
        this.a = addVar;
        this.b = pni1Var;
    }

    public final boolean a(String str) {
        if (str != null && this.a.a.o0()) {
            pni1 pni1Var = this.b;
            if (pni1Var.a() && pni1Var.b.isEnabled()) {
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str);
                Set set2 = pcf.a;
                String strO = s4b1VarX.o(1);
                String strJ = s4b1VarX.j();
                if (s4b1VarX.c == blc0.Bj && o7h.i0(pcf.a, strO) && strJ != null && !nhc1.Y(strJ, "share-", false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
