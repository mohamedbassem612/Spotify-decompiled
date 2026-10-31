package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hem1 implements hth0 {
    public w6e0 a;
    public final iu30 b;
    public int c = 1;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;

    public hem1(w6e0 w6e0Var, iu30 iu30Var) {
        this.a = w6e0Var;
        this.b = iu30Var;
        w6e0Var.e = new f2m1(this, w6e0Var, (byte) 14);
        w6e0Var.j();
        float f = this.d;
        if (u890.j((dgh0) w6e0Var.b, bgh0.a)) {
            return;
        }
        ((yo00) w6e0Var.d).g(zko1.o(f));
    }

    @Override // p.hth0
    public final void a() {
        if (this.c == 4) {
            return;
        }
        this.f = false;
        e();
    }

    @Override // p.hth0
    public final void b(boolean z) {
        if (this.c == 4 || z == this.e) {
            return;
        }
        this.e = z;
        w6e0 w6e0Var = this.a;
        if (w6e0Var != null) {
            float f = z ? 0.0f : this.d;
            if (u890.j((dgh0) w6e0Var.b, bgh0.a)) {
                return;
            }
            ((yo00) w6e0Var.d).g(zko1.o(f));
        }
    }

    @Override // p.hth0
    public final float c() {
        return this.d;
    }

    @Override // p.hth0
    public final void d() {
        w6e0 w6e0Var;
        if (this.c == 4 || (w6e0Var = this.a) == null || u890.j((dgh0) w6e0Var.b, bgh0.a)) {
            return;
        }
        ((yo00) w6e0Var.d).h1(5, 0L);
    }

    public final void e() {
        boolean z = this.f && this.c == 2 && this.d > 0.0f;
        if (z == this.g) {
            return;
        }
        this.g = z;
        w6e0 w6e0Var = this.a;
        bgh0 bgh0Var = bgh0.a;
        if (z) {
            if (w6e0Var == null || u890.j((dgh0) w6e0Var.b, bgh0Var)) {
                return;
            }
            ((yo00) w6e0Var.d).M(true);
            return;
        }
        if (w6e0Var == null || u890.j((dgh0) w6e0Var.b, bgh0Var)) {
            return;
        }
        ((yo00) w6e0Var.d).M(false);
    }

    @Override // p.hth0
    public final void g(float f) {
        if (this.c == 4) {
            return;
        }
        float fO = zko1.o(f);
        if (fO == this.d) {
            return;
        }
        this.d = fO;
        w6e0 w6e0Var = this.a;
        if (w6e0Var != null) {
            if (this.e) {
                fO = 0.0f;
            }
            if (!u890.j((dgh0) w6e0Var.b, bgh0.a)) {
                ((yo00) w6e0Var.d).g(zko1.o(fO));
            }
        }
        e();
    }

    @Override // p.hth0
    public final void j() {
        if (this.c == 4) {
            return;
        }
        this.f = true;
        e();
    }

    @Override // p.hth0
    public final void release() {
        if (this.c == 4) {
            return;
        }
        this.c = 4;
        this.f = false;
        this.g = false;
        w6e0 w6e0Var = this.a;
        if (w6e0Var != null) {
            w6e0Var.e = null;
            w6e0Var.j();
        }
        w6e0 w6e0Var2 = this.a;
        if (w6e0Var2 != null) {
            yo00 yo00Var = (yo00) w6e0Var2.d;
            dgh0 dgh0Var = (dgh0) w6e0Var2.b;
            bgh0 bgh0Var = bgh0.a;
            if (!u890.j(dgh0Var, bgh0Var)) {
                w6e0Var2.b = bgh0Var;
                w6e0Var2.e = null;
                w6e0Var2.j();
                yo00Var.P((egh0) w6e0Var2.c);
                yo00Var.y1();
            }
        }
        this.a = null;
    }
}
