package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n9h {
    public final s1b0 a;

    public n9h(s1b0 s1b0Var) {
        this.a = s1b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9h) && u890.j(this.a, ((n9h) obj).a);
    }

    public final int hashCode() {
        s1b0 s1b0Var = this.a;
        if (s1b0Var == null) {
            return 0;
        }
        return s1b0Var.hashCode();
    }
}
