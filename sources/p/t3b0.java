package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t3b0 {
    public y3b0 a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3b0)) {
            return false;
        }
        t3b0 t3b0Var = (t3b0) obj;
        return this.a.equals(t3b0Var.a) && u890.j(this.b, t3b0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.a);
        sb.append(", typeFlexibilityId=");
        return gvg.k(sb, this.b, ')');
    }
}
