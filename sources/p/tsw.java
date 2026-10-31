package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tsw implements vsw {
    public final m511 a;

    public tsw(m511 m511Var) {
        this.a = m511Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsw) && u890.j(this.a, ((tsw) obj).a);
    }

    public final int hashCode() {
        m511 m511Var = this.a;
        if (m511Var == null) {
            return 0;
        }
        return m511Var.hashCode();
    }
}
