package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j01 implements zxb0 {
    public final ji0 a;
    public final int b;

    public j01(ji0 ji0Var, int i) {
        this.a = ji0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j01)) {
            return false;
        }
        j01 j01Var = (j01) obj;
        return u890.j(this.a, j01Var.a) && this.b == j01Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
