package p;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class op60 implements np60 {
    public final dp60 a;
    public final uyd1 b;
    public final dv00 c;

    public op60(dp60 dp60Var, uyd1 uyd1Var, dv00 dv00Var) {
        this.a = dp60Var;
        this.b = uyd1Var;
        this.c = dv00Var;
    }

    public final Object a(String str, boolean z, String str2, ice0 ice0Var, onm onmVar) {
        return np60.c(this, str, z, ice0.c, false, (String) null, onmVar, 48);
    }

    public final Object b(String str, boolean z, ice0 ice0Var, boolean z2, boolean z3, String str2, onm onmVar) {
        yz21 yz21Var = new yz21("", "ITGC test");
        uyd1 uyd1Var = this.b;
        ioj0 ioj0Var = uyd1Var.b;
        Map mapC = vyo1.C(ioj0Var);
        if (!mapC.isEmpty()) {
            this.c.f(mapC);
        }
        l2e l2eVar = new l2e(o7h.N0(Collections.singletonList(new e460("static-heading-id", "static-heading-section-source-id", new hvl1("Test Feed Heading", 254, (String) null, (String) null, false, (String) null), yz21Var)), uyd1Var.a), ioj0Var, yz21Var, str, x4e0.b, (Set) null, "", "");
        this.a.a(false);
        return l2eVar;
    }
}
