package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rnq0 extends hoq0 {
    public final me20 a;

    public rnq0(me20 me20Var) {
        this.a = me20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnq0) && this.a.equals(((rnq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
