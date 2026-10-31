package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vhb1 implements a4l {
    public final kly0 a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final g3e e;
    public final q8n f;
    public c9n g;

    public vhb1(kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, a8p a8pVar, g3e g3eVar, q8n q8nVar) {
        this.a = kly0Var;
        this.b = kly0Var2;
        this.c = kly0Var3;
        this.d = a8pVar;
        this.e = g3eVar;
        this.f = q8nVar;
        this.g = cy30.t(q8nVar);
    }

    @Override // p.a4l
    public final void a() {
        smo1.q(this.g);
    }

    @Override // p.a4l
    public final void b() {
        if (((iuq0) this.e).b()) {
            c9n c9nVarV = qmo1.v(this.g, new gga1(this, (byte) 23));
            this.g = c9nVarV;
            c921.y(c9nVarV, (o8n) null, 0, new xba1(this, (lnm) null, (byte) 9), 3);
        }
    }
}
