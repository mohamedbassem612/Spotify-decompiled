package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cov0 {
    public static final cov0 d = new cov0(null, 1, false);
    public final jj40 a;
    public final int b;
    public final boolean c;

    public cov0(jj40 jj40Var, int i, boolean z) {
        this.a = jj40Var;
        this.b = i;
        this.c = z;
    }

    public static cov0 a(cov0 cov0Var, jj40 jj40Var, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            jj40Var = cov0Var.a;
        }
        if ((i2 & 2) != 0) {
            i = cov0Var.b;
        }
        if ((i2 & 4) != 0) {
            z = cov0Var.c;
        }
        cov0Var.getClass();
        return new cov0(jj40Var, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cov0)) {
            return false;
        }
        cov0 cov0Var = (cov0) obj;
        return u890.j(this.a, cov0Var.a) && this.b == cov0Var.b && this.c == cov0Var.c;
    }

    public final int hashCode() {
        jj40 jj40Var = this.a;
        return Boolean.hashCode(this.c) + ab80.k(this.b, (jj40Var == null ? 0 : jj40Var.hashCode()) * 31, 31);
    }
}
