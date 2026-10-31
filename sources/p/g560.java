package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g560 extends j560 {
    public final c560 a;

    public g560(c560 c560Var) {
        this.a = c560Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g560) && this.a.equals(((g560) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
