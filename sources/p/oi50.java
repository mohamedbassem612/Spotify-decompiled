package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oi50 implements h0r0 {
    public final a8e0 a;
    public final lo8 b;
    public final ni50 c;
    public final cbr0 d;

    public oi50(a8e0 a8e0Var, qi50 qi50Var, lo8 lo8Var, ni50 ni50Var) {
        String strB;
        this.a = a8e0Var;
        this.b = lo8Var;
        this.c = ni50Var;
        if (qi50Var.a() instanceof mh90) {
            strB = ((mh90) qi50Var.a()).c;
        } else {
            String strB2 = qi50Var.b();
            strB = (strB2 == null || strB2.length() == 0) ? "" : qi50Var.b();
        }
        yxe1 yxe1Var = new yxe1(new ehc1(strB));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.e5(), nik1.H2, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return a8e0.b(this.a, this.c.a(), new u830(this, (byte) 29));
    }
}
