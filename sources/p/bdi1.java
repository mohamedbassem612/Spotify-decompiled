package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bdi1 implements h0r0 {
    public final kyj a;
    public final fdi1 b;
    public final yci1 c;
    public final edi1 d;
    public final boolean e;

    public bdi1(kyj kyjVar, fdi1 fdi1Var, yci1 yci1Var, edi1 edi1Var, boolean z) {
        this.a = kyjVar;
        this.b = fdi1Var;
        this.c = yci1Var;
        this.d = edi1Var;
        this.e = z;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        fdi1 fdi1Var = this.b;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(mqo1.E(fdi1Var.a()), mqo1.I(fdi1Var.a()), (nar0) null), new hgr0(egr0.a, 0, 2), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(1598928140, new zyf1(this, (byte) 9), true), new dx81(new adi1(this), new ymg1(this, (byte) 22), s9x0.U0, osh1.b1));
    }
}
