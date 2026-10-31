package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dq51 extends fz31 {
    public final byte[] X;
    public final usc Y;
    public final cq51 h;
    public final xpc i;
    public final bq51 t;

    public dq51(cq51 cq51Var, xpc xpcVar, bq51 bq51Var, byte[] bArr) {
        this.h = cq51Var;
        this.i = xpcVar;
        this.t = bq51Var;
        this.X = bArr;
        this.Y = new usc(xpcVar, cq51Var.b, bArr, bq51Var);
    }

    @Override // p.fz31
    public final void d() {
        this.Y.j = true;
    }

    @Override // p.fz31
    public final Object e() throws Exception {
        this.Y.a();
        bq51 bq51Var = this.t;
        if (bq51Var == null) {
            return null;
        }
        bq51Var.b++;
        ((vxu) bq51Var.e).f(bq51Var.c(), bq51Var.c, bq51Var.d);
        return null;
    }
}
