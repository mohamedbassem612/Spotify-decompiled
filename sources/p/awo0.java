package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class awo0 implements h0r0 {
    public final hod0 a;
    public final a8e0 b;
    public final l4h1 c;
    public final cbr0 d;

    public awo0(hod0 hod0Var, a8e0 a8e0Var, l4h1 l4h1Var) {
        this.a = hod0Var;
        this.b = a8e0Var;
        this.c = l4h1Var;
        yxe1 yxe1Var = new yxe1(new jx21(2131959202));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.P3(), nik1.W2, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        m6e0 m6e0VarK = this.a.k();
        y3o0 y3o0Var = new y3o0(this, (byte) 11);
        l391 l391Var = z391.Y;
        return this.b.a(m6e0VarK, y3o0Var, new u7r0(a4p1.v(new e491[]{z391.a, l391Var, l391Var, l391Var, l391Var, l391Var, l391Var, l391Var}), null, null, false, false, 126));
    }
}
