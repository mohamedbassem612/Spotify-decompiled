package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nwy extends swy {
    public final zd71 a;

    public nwy(zd71 zd71Var) {
        this.a = zd71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwy) && u890.j(this.a, ((nwy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
