package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i8c implements h0r0 {
    public final q59 a;
    public final cp31 b;
    public final a8c c;
    public final boolean d;
    public final cbr0 e;

    public i8c(q59 q59Var, cp31 cp31Var, a8c a8cVar, boolean z) {
        this.a = q59Var;
        this.b = cp31Var;
        this.c = a8cVar;
        this.d = z;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("FIND", "find", 555, "find"), nik1.z1, new s6l0()), new fja(gvn0.b), new j0c0(mno1.x), new ly3(), new pu00(true), new t1r0(true), new s9h1(14, true, false, false), new q1r0(true), new x7u0()}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        j2i j2iVar = new j2i(-688456638, new hp9(this, (byte) 14), true);
        q59 q59Var = this.a;
        return new r961((tz01) q59Var.b, this.c, new ef8(q59Var, j2iVar, (byte) 9), (byte) 20);
    }
}
