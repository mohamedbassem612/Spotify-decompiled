package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ng81 {
    public final xpw a;
    public final Object b;

    public ng81(Object obj, xpw xpwVar) {
        this.a = xpwVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng81)) {
            return false;
        }
        ng81 ng81Var = (ng81) obj;
        return u890.j(this.a, ng81Var.a) && this.b.equals(ng81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
