package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qf31 implements tf31 {
    public final ou80 a;

    public qf31(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf31) && u890.j(this.a, ((qf31) obj).a);
    }

    public final int hashCode() {
        ou80 ou80Var = this.a;
        if (ou80Var == null) {
            return 0;
        }
        return ou80Var.a.hashCode();
    }
}
