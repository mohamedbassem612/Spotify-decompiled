package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gd80 {
    public final xpw a;
    public final Object b;

    public gd80(Object obj, xpw xpwVar) {
        this.a = xpwVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd80)) {
            return false;
        }
        gd80 gd80Var = (gd80) obj;
        return this.a.equals(gd80Var.a) && this.b.equals(gd80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
