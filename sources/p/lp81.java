package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lp81 extends sn81 {
    public final gn2 a;

    public lp81(gn2 gn2Var) {
        this.a = gn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lp81) && this.a.equals(((lp81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
