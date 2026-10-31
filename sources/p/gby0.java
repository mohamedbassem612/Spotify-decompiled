package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gby0 extends hby0 {
    public final int a;
    public final w8d1 b;

    public gby0(int i, w8d1 w8d1Var) {
        this.a = i;
        this.b = w8d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gby0)) {
            return false;
        }
        gby0 gby0Var = (gby0) obj;
        return this.a == gby0Var.a && this.b.equals(gby0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
