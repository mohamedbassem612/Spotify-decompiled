package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class thl {
    public final Object a;
    public final int b;
    public final nnb0 c;

    public thl(Object obj, int i, nnb0 nnb0Var) {
        this.a = obj;
        this.b = i;
        this.c = nnb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thl)) {
            return false;
        }
        thl thlVar = (thl) obj;
        return this.a.equals(thlVar.a) && this.b == thlVar.b && this.c.equals(thlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
