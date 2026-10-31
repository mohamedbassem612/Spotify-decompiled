package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p920 extends u0p1 {
    public final d6c0 c;

    public p920(d6c0 d6c0Var) {
        this.c = d6c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p920) && this.c.equals(((p920) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
