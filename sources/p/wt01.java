package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wt01 extends au01 {
    public final ney0 a;

    public wt01(ney0 ney0Var) {
        this.a = ney0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt01) && this.a.equals(((wt01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
