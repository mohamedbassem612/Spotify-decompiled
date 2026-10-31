package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class scj1 implements c0u0 {
    public final iu30 a;
    public final pw9 b;

    public scj1(ymg1 ymg1Var, pw9 pw9Var) {
        this.a = ymg1Var;
        this.b = pw9Var;
    }

    public final void J(long j, long j2) {
        this.b.invoke(hzt0.a);
    }

    public final void O(long j, long j2) {
        this.b.invoke(new gzt0(j));
    }

    public final void R(r4t r4tVar, int i, long j, long j2) {
        iu30 iu30Var;
        this.b.invoke(new fzt0(i, j));
        if (i != 6 || (iu30Var = this.a) == null) {
            return;
        }
        iu30Var.invoke(Long.valueOf(j));
    }

    public final void S(long j, long j2) {
        this.b.invoke(izt0.a);
    }
}
