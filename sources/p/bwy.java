package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bwy extends t3k1 {
    public final ela1 b;
    public final u771 c;
    public final int d;
    public final boolean e;

    public bwy(ela1 ela1Var, u771 u771Var, int i, boolean z) {
        this.b = ela1Var;
        this.c = u771Var;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwy)) {
            return false;
        }
        bwy bwyVar = (bwy) obj;
        return u890.j(this.b, bwyVar.b) && u890.j(this.c, bwyVar.c) && this.d == bwyVar.d && this.e == bwyVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ab80.k(this.d, cfm0.g(this.c, this.b.hashCode() * 31, 31), 31);
    }
}
