package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w4p0 {
    public final kly0 a;
    public final kly0 b;
    public final yqg c;
    public iw4 d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    public w4p0(caq caqVar, caq caqVar2, yqg yqgVar) {
        this.a = caqVar;
        this.b = caqVar2;
        this.c = yqgVar;
    }

    public final void a() {
        iw4 iw4Var;
        iw4 iw4Var2 = this.d;
        if (iw4Var2 != null) {
            iw4Var2.b(3);
        }
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        if (((gv4) this.b.get()).a()) {
            this.e = this.c.c();
            iw4Var = (iw4) this.a.get();
            iw4Var.getClass();
            iw4.d(iw4Var, wso0.e);
            t45 t45Var = iw4Var.c;
            if (t45Var != null) {
                t45Var.b("npv_impl", "activity");
            }
        } else {
            iw4Var = null;
        }
        this.d = iw4Var;
    }
}
