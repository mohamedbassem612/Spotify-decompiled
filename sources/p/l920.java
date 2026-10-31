package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l920 {
    public final m0p1 a;
    public final int b;

    public l920(m0p1 m0p1Var, int i) {
        this.a = m0p1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l920)) {
            return false;
        }
        l920 l920Var = (l920) obj;
        return this.a.equals(l920Var.a) && this.b == l920Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }
}
