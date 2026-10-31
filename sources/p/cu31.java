package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cu31 implements du31 {
    public final ftv a;
    public final int b;

    public cu31(ftv ftvVar, int i) {
        this.a = ftvVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu31)) {
            return false;
        }
        cu31 cu31Var = (cu31) obj;
        return u890.j(this.a, cu31Var.a) && this.b == cu31Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
