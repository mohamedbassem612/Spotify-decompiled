package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jv91 {
    public nv91 a;
    public long b;
    public boolean c;
    public int d;

    static {
        new ekb((byte) 25);
    }

    public jv91(long j, nv91 nv91Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = nv91Var;
        this.b = j;
        ef41 ef41Var = pv91.a;
        if (j != 0) {
            nv91 nv91VarD = d();
            long j2 = nv91VarD.c;
            long[] jArr = nv91VarD.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = nv91VarD.b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = nv91VarD.a;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (pv91.c) {
                iA = pv91.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(jv91 jv91Var) {
        pv91.b.j(jv91Var);
    }

    public final void a() {
        synchronized (pv91.c) {
            b();
            p();
        }
    }

    public void b() {
        pv91.d = pv91.d.c(g());
    }

    public abstract void c();

    public nv91 d() {
        return this.a;
    }

    public abstract iu30 e();

    public boolean f() {
        return false;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public iu30 i() {
        return null;
    }

    public final jv91 j() {
        yt91 yt91Var = pv91.b;
        jv91 jv91Var = (jv91) yt91Var.e();
        yt91Var.j(this);
        return jv91Var;
    }

    public void k() {
        oho1.z();
        throw null;
    }

    public void l() {
        oho1.z();
        throw null;
    }

    public void n(ypb1 ypb1Var) {
        ef41 ef41Var = pv91.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            pv91.f.i(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(nv91 nv91Var) {
        this.a = nv91Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract jv91 u(iu30 iu30Var);

    public void m() {
    }
}
