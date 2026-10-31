package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ja10 {
    public final Object a;
    public final Object b;

    public ja10(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja10)) {
            return false;
        }
        ja10 ja10Var = (ja10) obj;
        return this.a.equals(ja10Var.a) && this.b.equals(ja10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
