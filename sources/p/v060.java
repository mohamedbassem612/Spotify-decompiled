package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v060 {
    public final xpw a;
    public final Object b;

    public v060(Object obj, xpw xpwVar) {
        this.a = xpwVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v060)) {
            return false;
        }
        v060 v060Var = (v060) obj;
        return u890.j(this.a, v060Var.a) && this.b.equals(v060Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
