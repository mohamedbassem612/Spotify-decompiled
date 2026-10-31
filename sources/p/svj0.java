package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class svj0 implements uvj0 {
    public final ha20 a;
    public final int b;

    public svj0(ha20 ha20Var, int i) {
        this.a = ha20Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svj0)) {
            return false;
        }
        svj0 svj0Var = (svj0) obj;
        return this.a == svj0Var.a && this.b == svj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
