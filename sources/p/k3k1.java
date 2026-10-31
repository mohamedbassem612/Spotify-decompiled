package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k3k1 {
    public final String a;
    public final Long b;

    public k3k1(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3k1)) {
            return false;
        }
        k3k1 k3k1Var = (k3k1) obj;
        return this.a.equals(k3k1Var.a) && u890.j(this.b, k3k1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
