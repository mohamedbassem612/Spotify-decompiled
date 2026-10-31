package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bcc1 implements h0r0 {
    public final esa1 a;
    public final csq b;
    public final pcc1 c;
    public final cbr0 d;

    public bcc1(h931 h931Var, esa1 esa1Var, csq csqVar, pcc1 pcc1Var) {
        this.a = esa1Var;
        this.b = csqVar;
        this.c = pcc1Var;
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.V4(), pcc1Var.a(), (nar0) null), new hgr0(egr0.a, 0, 2), new tc30(1)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return h931.a(new wh91(this, (byte) 28), new bxb1(this, (byte) 7));
    }
}
