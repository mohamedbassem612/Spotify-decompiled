package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j2h implements h0r0 {
    public final z7e0 a;
    public final h2h b;
    public final lo8 c;
    public final cbr0 d;

    public j2h(z7e0 z7e0Var, h2h h2hVar, lo8 lo8Var, s4b1 s4b1Var) {
        this.a = z7e0Var;
        this.b = h2hVar;
        this.c = lo8Var;
        dbr0 t1r0Var = new t1r0(true);
        dbr0 yxe1Var = new yxe1(new jx21(2131953978));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG0 = yon1.G0();
        kik1 kik1Var = nik1.Q;
        String strZ = s4b1Var.z();
        this.d = new cbr0(new dbr0[]{t1r0Var, yxe1Var, new bn70(p6r0VarG0, kik1Var.b(strZ == null ? "" : strZ), (nar0) null), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return z7e0.a(this.a, this.b, new syf(this, (byte) 18));
    }
}
