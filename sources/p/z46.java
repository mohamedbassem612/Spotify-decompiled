package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z46 implements h0r0 {
    public final yuj a;
    public final x86 b;
    public final z86 c;
    public final yu3 d;
    public final qzo e;
    public final l96 f;
    public final j46 g;
    public final ba6 h;
    public final cbr0 i;

    public z46(yuj yujVar, x86 x86Var, z86 z86Var, yu3 yu3Var, qzo qzoVar, l96 l96Var, j46 j46Var, ba6 ba6Var) {
        this.a = yujVar;
        this.b = x86Var;
        this.c = z86Var;
        this.d = yu3Var;
        this.e = qzoVar;
        this.f = l96Var;
        this.g = j46Var;
        this.h = ba6Var;
        this.i = new cbr0(new dbr0[]{ba6Var.getIdentifier(), new bt21(), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837), new pu00(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.i;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        z86 z86Var = this.c;
        a56 a56VarK = this.d.k(z86Var.a());
        v46 v46VarD = a56VarK.d();
        String strT = jzn1.t(z86Var.a());
        m6e0 m6e0VarG = f4p1.g(v46VarD);
        n7e0 n7e0Var = new n7e0(new x46(this, a56VarK), new y46(a56VarK, this, strT, (byte) 0), vrg.g);
        return yuj.b(this.a, m6e0VarG, apo.j(-1275682473, new v72(this, (byte) 16), true), n7e0Var);
    }
}
