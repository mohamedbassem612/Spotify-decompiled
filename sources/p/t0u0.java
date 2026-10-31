package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class t0u0 extends roa {
    public static final /* synthetic */ mma0[] t1 = {new een0(t0u0.class, "hasStarted", "getHasStarted()Z", 0)};
    public final yu0 p1;
    public boolean q1;
    public boolean r1;
    public final ce0 s1;

    public t0u0(yu0 yu0Var) {
        super(yu0Var.a, yu0Var.b);
        this.p1 = yu0Var;
        this.s1 = new ce0(this);
    }

    public static /* synthetic */ void X(t0u0 t0u0Var, ao0 ao0Var, co0 co0Var, String str, Long l, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        t0u0Var.W(ao0Var, co0Var, str, l, str2, str3);
    }

    public void J(long j, long j2) {
        ((roa) this).a1 = true;
        mma0[] mma0VarArr = t1;
        mma0 mma0Var = mma0VarArr[0];
        ce0 ce0Var = this.s1;
        if (!((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
            ce0Var.c(mma0VarArr[0], this, Boolean.TRUE);
            V(U());
        }
        this.q1 = false;
    }

    public void O(long j, long j2) {
        super.O(j, j2);
        this.q1 = true;
    }

    public void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        this.s1.c(t1[0], this, Boolean.FALSE);
    }

    public final long U() {
        kqz0 kqz0Var = (kqz0) o7h.C0(((roa) this).h1);
        if (kqz0Var != null) {
            return kqz0Var.f;
        }
        return 0L;
    }

    public final void W(ao0 ao0Var, co0 co0Var, String str, Long l, String str2, String str3) {
        if (this.r1) {
            ao0.c(ao0Var, co0Var, str, l, str2, (String) null, (String) null, str3, 16);
        }
    }

    public final void m(long j, long j2) {
        super.m(j, j2);
        mma0[] mma0VarArr = t1;
        mma0 mma0Var = mma0VarArr[0];
        ce0 ce0Var = this.s1;
        if (((Boolean) ((sgp0) ce0Var).a).booleanValue() || !this.p1.b.c) {
            return;
        }
        ce0Var.c(mma0VarArr[0], this, Boolean.TRUE);
        V(j);
    }

    public void V(long j) {
    }
}
