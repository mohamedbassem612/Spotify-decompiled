package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yb20 {
    public final c380 a;
    public final c380 b;

    public yb20(c380 c380Var, c380 c380Var2) {
        this.a = c380Var;
        this.b = c380Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb20)) {
            return false;
        }
        yb20 yb20Var = (yb20) obj;
        return u890.j(this.a, yb20Var.a) && u890.j(this.b, yb20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
