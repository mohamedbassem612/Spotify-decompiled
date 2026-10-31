package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iv20 {
    public afh0 a;
    public q5t0 b;
    public afh0 c;
    public q5t0 d;
    public jr80 e;
    public jr80 f;

    public final jr80 a(int i, int i2, boolean z) {
        int iC = l1d.C(2);
        if (iC == 0 || iC == 1) {
            return null;
        }
        if (iC == 2) {
            if (z) {
                return this.e;
            }
            return null;
        }
        if (iC != 3) {
            eg.o();
            return null;
        }
        if (z) {
            return this.e;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.f;
    }

    public final void b(afh0 afh0Var, afh0 afh0Var2, long j) {
        long jH = w361.h(1, j);
        if (afh0Var != null) {
            int iW = afh0Var.w(hjl.h(jH));
            this.e = new jr80(jr80.a(iW, afh0Var.n(iW)));
            this.a = afh0Var;
            this.b = null;
        }
        if (afh0Var2 != null) {
            int iW2 = afh0Var2.w(hjl.h(jH));
            this.f = new jr80(jr80.a(iW2, afh0Var2.n(iW2)));
            this.c = afh0Var2;
            this.d = null;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iv20);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + kaa0.f(0, l1d.C(2) * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=Clip, minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
