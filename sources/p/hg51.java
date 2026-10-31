package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hg51 {
    public final xpw a;
    public final Object b;
    public final int c;

    public hg51(xpw xpwVar, Object obj, int i) {
        this.a = xpwVar;
        this.b = obj;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg51)) {
            return false;
        }
        hg51 hg51Var = (hg51) obj;
        return u890.j(this.a, hg51Var.a) && u890.j(this.b, hg51Var.b) && this.c == hg51Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
