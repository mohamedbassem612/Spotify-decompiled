package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hks implements rs31, xwh0 {
    public final p7s a;
    public final ewh0 b;
    public final yqg c;
    public final q8n d;
    public c9n e;
    public w2z f;
    public ezc g;
    public faa0 h;
    public boolean i;
    public final dt71 j = mgo1.e(0, 64, 0, 5);

    public hks(p7s p7sVar, ewh0 ewh0Var, yqg yqgVar, q8n q8nVar) {
        this.a = p7sVar;
        this.b = ewh0Var;
        this.c = yqgVar;
        this.d = q8nVar;
        this.e = cy30.t(q8nVar);
    }

    @Override // p.xwh0
    public final void a() {
        smo1.q(this.e);
        this.h = null;
        this.g = null;
        this.f = null;
    }

    @Override // p.rs31
    public final void c() {
        faa0 faa0Var = this.h;
        if (faa0Var == null || !faa0Var.isActive() || this.i) {
            faa0 faa0Var2 = this.h;
            if (faa0Var2 != null) {
                faa0Var2.d(null);
            }
            c9n c9nVarC = foo1.C(this.e, new gks(this, (byte) 1));
            this.e = c9nVarC;
            this.h = c921.y(c9nVarC, (o8n) null, 0, new n1o(this, (lnm) null, (byte) 20), 3);
            this.i = false;
        }
    }

    @Override // p.rs31
    public final void d() {
        if (this.i) {
            return;
        }
        faa0 faa0Var = this.h;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.g = h4p1.f(new hl0(this, true, (lnm) null));
        c9n c9nVarC = foo1.C(this.e, new d4e(this, (byte) 18));
        this.e = c9nVarC;
        this.h = c921.y(c9nVarC, (o8n) null, 0, new mx(this, (lnm) null, (byte) 16), 3);
        this.i = true;
    }

    @Override // p.rs31
    public final dt71 e() {
        return this.j;
    }

    @Override // p.rs31
    public final void f() {
        c();
    }

    @Override // p.rs31
    public final void g() {
        faa0 faa0Var = this.h;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.h = null;
    }
}
