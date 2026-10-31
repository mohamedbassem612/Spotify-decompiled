package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yu0 {
    public final m0u0 a;
    public final oot0 b;
    public final np00 c;

    public yu0(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var) {
        this.a = m0u0Var;
        this.b = oot0Var;
        this.c = np00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yu0) {
            yu0 yu0Var = (yu0) obj;
            return this.a.equals(yu0Var.a) && u890.j(this.b, yu0Var.b) && this.c == yu0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
