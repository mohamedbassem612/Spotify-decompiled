package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p7l1 {
    public final f7l1 a;

    public p7l1(f7l1 f7l1Var) {
        this.a = f7l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7l1) && u890.j(this.a, ((p7l1) obj).a);
    }

    public final int hashCode() {
        f7l1 f7l1Var = this.a;
        if (f7l1Var == null) {
            return 0;
        }
        return f7l1Var.a.hashCode();
    }
}
