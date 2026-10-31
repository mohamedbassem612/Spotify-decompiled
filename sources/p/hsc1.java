package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hsc1 implements h0r0 {
    public final qyj a;
    public final ssc1 b;
    public final isq c;
    public final cbr0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public hsc1(qyj qyjVar, ssc1 ssc1Var, isq isqVar, e5b0 e5b0Var) {
        this.a = qyjVar;
        this.b = ssc1Var;
        this.c = isqVar;
        String str = ssc1Var.c;
        String str2 = ssc1Var.b;
        tkl0 tkl0Var = new tkl0(str2, String.valueOf(ssc1Var.d), str);
        yxe1 yxe1Var = new yxe1(new ehc1("Page Match success"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("PAGE_MATCH_SUCCESS", "page-match/success", 1396, "page-match"), new lik1(str2), tkl0Var), new t1r0(true), new s9h1(14, true, false, false), new tx60(3, (String) null, tkl0Var.b()), e5b0Var}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(14655763, new gsc1(this, (byte) 0), true));
    }
}
