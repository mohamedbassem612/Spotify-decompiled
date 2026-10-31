package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s951 {
    public final lxr0 a;
    public final vyr0 b;

    public s951(lxr0 lxr0Var, vyr0 vyr0Var) {
        this.a = lxr0Var;
        this.b = vyr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s951)) {
            return false;
        }
        s951 s951Var = (s951) obj;
        return u890.j(this.a, s951Var.a) && u890.j(this.b, s951Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
