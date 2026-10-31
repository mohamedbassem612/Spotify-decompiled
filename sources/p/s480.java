package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s480 {
    public final p8h1 a;
    public final j2i b;

    public s480(p8h1 p8h1Var, j2i j2iVar) {
        this.a = p8h1Var;
        this.b = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s480) {
            s480 s480Var = (s480) obj;
            return u890.j(this.a, s480Var.a) && this.b == s480Var.b;
        }
        return false;
    }

    public final int hashCode() {
        p8h1 p8h1Var = this.a;
        return this.b.hashCode() + ((p8h1Var == null ? 0 : p8h1Var.hashCode()) * 31);
    }
}
