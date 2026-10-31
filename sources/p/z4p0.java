package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z4p0 {
    public final n6r0 a;
    public final osm0 b;
    public x8c0 d;
    public utm0 e;
    public final e72 c = new e72(this, (byte) 6);
    public final v1r0 f = new v1r0(new y3o0(this, 21), new nrj0(this, (byte) 20), new y4p0(this, (byte) 0));

    public z4p0(msm0 msm0Var, n6r0 n6r0Var) {
        this.a = n6r0Var;
        this.b = msm0Var.a(new ez3((byte) 2));
    }

    public final void a() {
        w8c0 w8c0VarB;
        x8c0 x8c0Var = this.d;
        if (x8c0Var != null && (w8c0VarB = x8c0Var.b()) != null && w8c0VarB.a(w8c0.d)) {
            if (this.e != null) {
                return;
            }
            this.e = this.b.b(new esm0("npv", new y4p0(this, (byte) 1)), 3);
        } else {
            utm0 utm0Var = this.e;
            if (utm0Var != null) {
                utm0Var.d();
            }
            this.e = null;
        }
    }
}
