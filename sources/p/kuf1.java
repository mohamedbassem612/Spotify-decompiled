package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kuf1 {
    public final puf1 a;
    public final String b;

    public kuf1(puf1 puf1Var, String str) {
        this.a = puf1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuf1)) {
            return false;
        }
        kuf1 kuf1Var = (kuf1) obj;
        return u890.j(this.a, kuf1Var.a) && u890.j(this.b, kuf1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
