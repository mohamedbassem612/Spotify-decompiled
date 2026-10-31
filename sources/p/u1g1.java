package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u1g1 {
    public final String a;
    public final int b;

    public u1g1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1g1)) {
            return false;
        }
        u1g1 u1g1Var = (u1g1) obj;
        return this.a.equals(u1g1Var.a) && this.b == u1g1Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }
}
