package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p4y implements x4y {
    public final ou80 a;

    public p4y(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4y) && u890.j(this.a, ((p4y) obj).a);
    }

    public final int hashCode() {
        ou80 ou80Var = this.a;
        if (ou80Var == null) {
            return 0;
        }
        return ou80Var.a.hashCode();
    }
}
