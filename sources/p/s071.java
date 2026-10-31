package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s071 implements w071 {
    public final ou80 a;

    public s071(ou80 ou80Var) {
        this.a = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s071) && u890.j(this.a, ((s071) obj).a);
    }

    public final int hashCode() {
        ou80 ou80Var = this.a;
        if (ou80Var == null) {
            return 0;
        }
        return ou80Var.a.hashCode();
    }
}
