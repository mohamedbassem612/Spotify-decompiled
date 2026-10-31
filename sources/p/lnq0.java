package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lnq0 extends poz0 {
    public final me20 b;

    public lnq0(me20 me20Var) {
        this.b = me20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnq0) && this.b.equals(((lnq0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
