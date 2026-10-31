package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class la3 {
    public final qxc0 a;
    public final boolean b;

    public la3(qxc0 qxc0Var, boolean z) {
        this.a = qxc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la3)) {
            return false;
        }
        la3 la3Var = (la3) obj;
        return this.a.equals(la3Var.a) && this.b == la3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
