package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yl3 extends pxd0 {
    public final mi31 l;

    public yl3(mi31 mi31Var) {
        this.l = mi31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl3) && u890.j(this.l, ((yl3) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return "Block(lineProviderBlock=" + this.l + ")";
    }

    public final int w(q5t0 q5t0Var) {
        return ((Number) this.l.a.invoke(q5t0Var)).intValue();
    }
}
