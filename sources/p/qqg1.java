package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qqg1 {
    public final boolean a;
    public final dn90 b;
    public final acz0 c;

    public qqg1(boolean z, dn90 dn90Var, acz0 acz0Var) {
        this.a = z;
        this.b = dn90Var;
        this.c = acz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qqg1) {
            qqg1 qqg1Var = (qqg1) obj;
            return this.a == qqg1Var.a && this.b.equals(qqg1Var.b) && this.c == qqg1Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, true)) * 31);
    }
}
