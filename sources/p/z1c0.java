package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z1c0 implements h0r0 {
    public final kyj a;
    public final m2c0 b;
    public final o2c0 c;

    public z1c0(kyj kyjVar, m2c0 m2c0Var, o2c0 o2c0Var) {
        this.a = kyjVar;
        this.b = m2c0Var;
        this.c = o2c0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        o2c0 o2c0Var = this.c;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(ozn1.u(o2c0Var.a()), ozn1.v(o2c0Var.a()), (nar0) null), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(gvi.a, new dx81(new y1c0(this), new pdb0(this, (byte) 9), bk20.h, hyb0.X));
    }
}
