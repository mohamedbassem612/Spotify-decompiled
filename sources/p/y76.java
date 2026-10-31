package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y76 implements m86 {
    public final xwx0 a;

    public y76(xwx0 xwx0Var) {
        this.a = xwx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y76) && this.a.equals(((y76) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
