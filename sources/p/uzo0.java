package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uzo0 extends pno1 {
    public final ou80 d;

    public uzo0(ou80 ou80Var) {
        this.d = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzo0) && u890.j(this.d, ((uzo0) obj).d);
    }

    public final int hashCode() {
        ou80 ou80Var = this.d;
        if (ou80Var == null) {
            return 0;
        }
        return ou80Var.a.hashCode();
    }
}
