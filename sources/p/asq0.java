package p;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class asq0 implements h0r0 {
    public final qyj a;
    public final psq0 b;
    public final dxp c;
    public final w8r0 d;
    public final r6h1 e;
    public final cbr0 f;

    /* JADX WARN: Multi-variable type inference failed */
    public asq0(qyj qyjVar, psq0 psq0Var, dxp dxpVar, e5b0 e5b0Var, w8r0 w8r0Var) {
        this.a = qyjVar;
        this.b = psq0Var;
        this.c = dxpVar;
        this.d = w8r0Var;
        String str = psq0Var.b;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-page-match-outbound-scanning-page";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("page-match/outbound-scanning");
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
        this.e = r6h1Var2;
        yxe1 yxe1Var = new yxe1(new ehc1("Page Match outbound scanning"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("PAGE_MATCH_OUTBOUND_SCANNING", "page-match/outbound-scanning", 1395, "page-match"), new lik1(str), (nar0) null), new t1r0(true), new s9h1(14, true, false, false), new tx60(3, (String) null, r6h1Var2), e5b0Var}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(1573018379, new wrq0(this, (byte) 1), true));
    }
}
