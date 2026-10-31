package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class spv0 implements h0r0 {
    public final cbr0 a;

    public spv0(upv0 upv0Var) {
        yxe1 yxe1Var = new yxe1(new jx21(upv0Var.b()));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.a = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.Z3(), upv0Var.a(), (nar0) null), new j0c0(mno1.V)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.a;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return new jxa((byte) 20);
    }
}
