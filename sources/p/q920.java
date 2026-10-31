package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q920 extends u0p1 {
    public final d6c0 c;

    public q920(d6c0 d6c0Var) {
        this.c = d6c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q920) && this.c.equals(((q920) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
