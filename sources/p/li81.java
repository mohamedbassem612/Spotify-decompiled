package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class li81 {
    public final xpw a;
    public final Object b;

    public li81(Object obj, xpw xpwVar) {
        this.a = xpwVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li81)) {
            return false;
        }
        li81 li81Var = (li81) obj;
        return u890.j(this.a, li81Var.a) && this.b.equals(li81Var.b);
    }

    public final int hashCode() {
        return l1d.C(1) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
