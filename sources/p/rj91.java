package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rj91 extends bk91 {
    public final ol91 a;
    public final long b;

    public rj91(ol91 ol91Var, long j) {
        this.a = ol91Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj91)) {
            return false;
        }
        rj91 rj91Var = (rj91) obj;
        return this.a.equals(rj91Var.a) && this.b == rj91Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
