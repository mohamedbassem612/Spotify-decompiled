package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wpc implements k2r {
    public zv81 a;
    public bm00 b = new bm00((byte) 4, false);
    public pqc c = pqc.m;
    public boolean d;
    public k2r e;

    public final xpc a(o2r o2rVar, int i) {
        vpc vpcVarO;
        zv81 zv81Var = this.a;
        zv81Var.getClass();
        if (this.d || o2rVar == null) {
            vpcVarO = null;
        } else {
            dg8 dg8Var = new dg8();
            dg8Var.u(zv81Var);
            vpcVarO = dg8Var.o();
        }
        return new xpc(zv81Var, o2rVar, this.b.j(), vpcVarO, this.c, i);
    }

    @Override // p.k2r
    public final o2r j() {
        k2r k2rVar = this.e;
        return a(k2rVar != null ? k2rVar.j() : null, 0);
    }
}
