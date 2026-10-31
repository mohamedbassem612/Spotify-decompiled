package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ae20 implements ce20 {
    public final de20 a;

    public ae20(de20 de20Var) {
        this.a = de20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae20) && this.a.equals(((ae20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
