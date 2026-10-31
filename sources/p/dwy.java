package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dwy extends t3k1 {
    public final on71 b;

    public dwy(on71 on71Var) {
        this.b = on71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwy) && this.b.equals(((dwy) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
