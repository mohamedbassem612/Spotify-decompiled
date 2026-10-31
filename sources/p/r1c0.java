package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r1c0 {
    public final hrr0 A;
    public final hrr0 B;
    public uu0 a;
    public final h311 b;
    public final k6a1 c;
    public final jut d;
    public c9e1 e;
    public final hrr0 f;
    public final hrr0 g;
    public elb0 h;
    public final hrr0 i;
    public af5 j;
    public final hrr0 k;
    public final hrr0 l;
    public final hrr0 m;
    public final hrr0 n;
    public final hrr0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f124p;
    public final hrr0 q;
    public final zta0 r;
    public final hrr0 s;
    public final hrr0 t;
    public iu30 u;
    public final l7n v;
    public final l7n w;
    public final l7n x;
    public final lw4 y;
    public long z;

    public r1c0(uu0 uu0Var, h311 h311Var, k6a1 k6a1Var) {
        this.a = uu0Var;
        this.b = h311Var;
        this.c = k6a1Var;
        jut jutVar = new jut((byte) 13);
        af5 af5Var = bf5.a;
        long j = nbe1.b;
        c8e1 c8e1Var = new c8e1(af5Var, j, (nbe1) null);
        jutVar.b = c8e1Var;
        jutVar.c = new k4w(af5Var, c8e1Var.b);
        this.d = jutVar;
        Boolean bool = Boolean.FALSE;
        this.f = v8r.q(bool);
        this.g = v8r.q(new p3v(0.0f));
        this.i = v8r.q((Object) null);
        this.k = v8r.q(zr50.a);
        this.l = v8r.q(bool);
        this.m = v8r.q(bool);
        this.n = v8r.q(bool);
        this.o = v8r.q(bool);
        this.f124p = true;
        this.q = v8r.q(Boolean.TRUE);
        this.r = new zta0(k6a1Var);
        this.s = v8r.q(bool);
        this.t = v8r.q(bool);
        this.u = new pv40((byte) 23);
        this.v = new l7n(this, (byte) 1);
        this.w = new l7n(this, (byte) 2);
        this.x = new l7n(this, (byte) 3);
        this.y = fdg1.l();
        this.z = u7h.k;
        this.A = v8r.q(new nbe1(j));
        this.B = v8r.q(new nbe1(j));
    }

    public final zr50 a() {
        return (zr50) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final elb0 c() {
        elb0 elb0Var = this.h;
        if (elb0Var == null || !elb0Var.a()) {
            return null;
        }
        return elb0Var;
    }

    public final z9e1 d() {
        return (z9e1) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new nbe1(j));
    }

    public final void f(long j) {
        this.A.setValue(new nbe1(j));
    }
}
