package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j3c0 extends rqo1 {
    public final ou80 c;

    public j3c0(ou80 ou80Var) {
        this.c = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3c0) && u890.j(this.c, ((j3c0) obj).c);
    }

    public final int hashCode() {
        ou80 ou80Var = this.c;
        if (ou80Var == null) {
            return 0;
        }
        return ou80Var.a.hashCode();
    }
}
