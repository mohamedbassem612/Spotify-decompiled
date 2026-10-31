package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p04 {
    public final v72 a;

    public p04(v72 v72Var) {
        this.a = v72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p04) && this.a == ((p04) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
