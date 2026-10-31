package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d1p0 {
    public final String a;
    public final Integer b;

    public d1p0(Integer num, String str) {
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1p0)) {
            return false;
        }
        d1p0 d1p0Var = (d1p0) obj;
        return u890.j(this.a, d1p0Var.a) && u890.j(this.b, d1p0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
