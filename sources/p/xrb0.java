package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xrb0 {
    public final c9n a;
    public final yd50 b;
    public final g030 c;
    public ni20 d;
    public ni20 e;
    public ni20 f;
    public boolean g;
    public final hrr0 h;
    public final hrr0 i;
    public final hrr0 j;
    public final hrr0 k;
    public long l;
    public long m;
    public long n;
    public be50 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o95 f144p;
    public final o95 q;
    public final hrr0 r;

    public xrb0(c9n c9nVar, yd50 yd50Var, g030 g030Var) {
        this.a = c9nVar;
        this.b = yd50Var;
        this.c = g030Var;
        Boolean bool = Boolean.FALSE;
        this.h = xto.t(bool);
        this.i = xto.t(bool);
        this.j = xto.t(bool);
        this.k = xto.t(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        this.n = 9223372034707292159L;
        Object obj = null;
        this.o = yd50Var != null ? yd50Var.b() : null;
        int i = 12;
        this.f144p = new o95(new qr80(0L), rno1.g, obj, i);
        this.q = new o95(Float.valueOf(1.0f), rno1.a, obj, i);
        this.r = xto.t(new qr80(0L));
    }

    public final void a() {
        be50 be50Var = this.o;
        ni20 ni20Var = this.d;
        hrr0 hrr0Var = this.i;
        boolean zBooleanValue = ((Boolean) hrr0Var.getValue()).booleanValue();
        c9n c9nVar = this.a;
        if (zBooleanValue || ni20Var == null || be50Var == null) {
            if (c()) {
                if (be50Var != null) {
                    be50Var.g(1.0f);
                }
                c921.y(c9nVar, (o8n) null, 0, new urb0(this, (lnm) null, (byte) 0), 3);
                return;
            }
            return;
        }
        hrr0Var.setValue(Boolean.TRUE);
        boolean zC = c();
        boolean z = !zC;
        if (!zC) {
            be50Var.g(0.0f);
        }
        c921.y(c9nVar, (o8n) null, 0, new kv1(z, this, ni20Var, be50Var, (lnm) null, (byte) 11), 3);
    }

    public final void b() {
        if (((Boolean) this.h.getValue()).booleanValue()) {
            c921.y(this.a, (o8n) null, 0, new urb0(this, (lnm) null, (byte) 1), 3);
        }
    }

    public final boolean c() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void d() {
        yd50 yd50Var;
        hrr0 hrr0Var = this.h;
        boolean zBooleanValue = ((Boolean) hrr0Var.getValue()).booleanValue();
        c9n c9nVar = this.a;
        if (zBooleanValue) {
            hrr0Var.setValue(Boolean.FALSE);
            c921.y(c9nVar, (o8n) null, 0, new urb0(this, (lnm) null, (byte) 2), 3);
        }
        hrr0 hrr0Var2 = this.i;
        if (((Boolean) hrr0Var2.getValue()).booleanValue()) {
            hrr0Var2.setValue(Boolean.FALSE);
            c921.y(c9nVar, (o8n) null, 0, new urb0(this, (lnm) null, (byte) 3), 3);
        }
        if (c()) {
            this.j.setValue(Boolean.FALSE);
            c921.y(c9nVar, (o8n) null, 0, new urb0(this, (lnm) null, (byte) 4), 3);
        }
        this.g = false;
        e(0L);
        this.l = 9223372034707292159L;
        be50 be50Var = this.o;
        if (be50Var != null && (yd50Var = this.b) != null) {
            yd50Var.c(be50Var);
        }
        this.o = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void e(long j) {
        this.r.setValue(new qr80(j));
    }
}
