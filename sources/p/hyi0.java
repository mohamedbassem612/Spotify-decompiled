package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hyi0 implements lyi0 {
    public final ou80 a;

    public hyi0(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyi0) && u890.j(this.a, ((hyi0) obj).a);
    }

    public final int hashCode() {
        ou80 ou80Var = this.a;
        if (ou80Var == null) {
            return 0;
        }
        return ou80Var.a.hashCode();
    }
}
