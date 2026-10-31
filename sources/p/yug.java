package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yug implements p090 {
    public final /* synthetic */ byte a;

    public final ry21 a(uf01 uf01Var) {
        switch (this.a) {
            case 0:
                return uf01Var.b(uf01Var.e);
            case 1:
                ne neVarB = uf01Var.e.b();
                ((t360) neVarB.c).b("Content-Type", "application/json;charset=UTF-8");
                neVarB.d("Accept", "application/json;charset=UTF-8");
                return uf01Var.b(new ln21(neVarB));
            case 2:
                ne neVarB2 = uf01Var.e.b();
                neVarB2.k(upc.n);
                return uf01Var.b(new ln21(neVarB2));
            default:
                String strW = nhc1.W(UUID.randomUUID().toString(), "-", "");
                ne neVarB3 = uf01Var.e.b();
                ((t360) neVarB3.c).b("X-rid", strW);
                return uf01Var.b(new ln21(neVarB3));
        }
    }
}
