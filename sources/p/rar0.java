package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rar0 implements sar0 {
    public final y6r0 a;
    public final n6r0 b;

    public rar0(y6r0 y6r0Var, n6r0 n6r0Var) {
        this.a = y6r0Var;
        this.b = n6r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rar0)) {
            return false;
        }
        rar0 rar0Var = (rar0) obj;
        return this.a.equals(rar0Var.a) && u890.j(this.b, rar0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
