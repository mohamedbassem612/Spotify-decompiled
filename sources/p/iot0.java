package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iot0 {
    public final int a;
    public final v6y0 b;
    public final boolean c;

    public iot0(int i, v6y0 v6y0Var, boolean z) {
        this.a = i;
        this.b = v6y0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iot0)) {
            return false;
        }
        iot0 iot0Var = (iot0) obj;
        return this.a == iot0Var.a && u890.j(this.b, iot0Var.b) && this.c == iot0Var.c;
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        v6y0 v6y0Var = this.b;
        return Boolean.hashCode(this.c) + ((iC + (v6y0Var == null ? 0 : v6y0Var.hashCode())) * 31);
    }
}
