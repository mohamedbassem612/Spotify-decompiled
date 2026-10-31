package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u8a1 implements h0r0 {
    public final hvj a;
    public final i9a1 b;
    public final kly0 c;
    public final kly0 d;
    public final idd1 e = new idd1(new t8a1(this, 1));
    public final idd1 f = new idd1(new t8a1(this, 0));
    public final cbr0 g;

    public u8a1(p6r0 p6r0Var, hvj hvjVar, i9a1 i9a1Var, jly0 jly0Var, jly0 jly0Var2) {
        this.a = hvjVar;
        this.b = i9a1Var;
        this.c = jly0Var;
        this.d = jly0Var2;
        kik1 kik1Var = nik1.E6;
        String str = i9a1Var.b;
        this.g = new cbr0(new dbr0[]{new bn70(p6r0Var, kik1Var.b(str), new nar0(new i1m0(p6r0Var.c, str))), new pu00(true), new t1r0(true), new s9h1(12, true, true, false)}, false);
    }

    public static final z8a1 d(u8a1 u8a1Var) {
        return (z8a1) u8a1Var.e.getValue();
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return hvj.b(this.a, f4p1.g((c8a1) this.f.getValue()), new j2i(-1862390971, new ec3(this, (byte) 9), true));
    }
}
