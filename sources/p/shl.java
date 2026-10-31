package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class shl {
    public final Object a;
    public final boolean b;
    public final nnb0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public shl(Object obj, int i, nnb0 nnb0Var) {
        this.a = obj;
        this.b = i;
        this.c = nnb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shl)) {
            return false;
        }
        shl shlVar = (shl) obj;
        return this.a.equals(shlVar.a) && this.b == shlVar.b && this.c.equals(shlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b ? 1 : 0, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.a + ", index=" + (this.b ? 1 : 0) + ", reference=" + this.c + ')';
    }
}
