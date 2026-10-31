package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a8g1 implements o2i0 {
    public final ppa a;
    public final List b;
    public final w6e0 c;

    public a8g1(cnh0 cnh0Var, yqu0 yqu0Var, l270 l270Var, rma rmaVar, ppa ppaVar) {
        this.a = ppaVar;
        List listA = cnh0Var.a(l270Var, rmaVar.a());
        this.b = listA;
        this.c = new w6e0(l270Var, yqu0Var, listA, (Object) null, (byte) 20);
    }

    public final qba b(yoh0 yoh0Var) {
        soh0 soh0Var = yoh0Var.b;
        qba qbaVarG = this.c.g(new m0u0(new o2u0(String.valueOf(soh0Var != null ? soh0Var.a : null), 14, (Map) null), "", ""), new z7g1(this), (bpa) null, 0, "", false);
        noh0 noh0Var = yoh0Var.e;
        return new dpg(qbaVarG, ((moh0) noh0Var).a * 1000, ((moh0) noh0Var).c * 1000);
    }
}
