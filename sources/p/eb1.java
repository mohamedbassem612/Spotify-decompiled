package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eb1 implements h0r0 {
    public final kyj a;
    public final ab1 b;
    public final nb1 c;
    public final em0 d;
    public final h7l0 e;
    public final g5l0 f;
    public final sb40 g;
    public final e5b0 h;

    public eb1(kyj kyjVar, ab1 ab1Var, nb1 nb1Var, em0 em0Var, h7l0 h7l0Var, g5l0 g5l0Var, sb40 sb40Var, e5b0 e5b0Var) {
        this.a = kyjVar;
        this.b = ab1Var;
        this.c = nb1Var;
        this.d = em0Var;
        this.e = h7l0Var;
        this.f = g5l0Var;
        this.g = sb40Var;
        this.h = e5b0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        nb1 nb1Var = this.c;
        return new cbr0(new dbr0[]{new bn70(nb1Var.e(), nb1Var.g(), (nar0) null), new t1r0(true), new s9h1(14, true, false, false), this.h, new hgr0(null, this.g.b.b() ? 2 : 1, 1)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1967484619, new m3(this, (byte) 24), true), new dx81(new db1(this), new j2(this, (byte) 25), new kcx0((byte) 27), gx0.Z));
    }

    public final bb1 c() {
        nb1 nb1Var = this.c;
        return new bb1(nb1Var.a(), nb1Var.b(), this.g.b.b());
    }
}
