package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mj71 extends pj71 {
    public final pj71 a;
    public final pj71 b;

    public mj71(pj71 pj71Var, pj71 pj71Var2) {
        this.a = pj71Var;
        this.b = pj71Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj71)) {
            return false;
        }
        mj71 mj71Var = (mj71) obj;
        return this.a.equals(mj71Var.a) && this.b.equals(mj71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
