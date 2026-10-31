package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hd80 {
    public final xpw a;
    public final Object b;

    public hd80(Object obj, xpw xpwVar) {
        this.a = xpwVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd80)) {
            return false;
        }
        hd80 hd80Var = (hd80) obj;
        return this.a.equals(hd80Var.a) && this.b.equals(hd80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
