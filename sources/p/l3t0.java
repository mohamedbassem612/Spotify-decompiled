package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l3t0 {
    public final vzl1 a;
    public final String b;
    public final Boolean c;
    public final int d;
    public final int e;

    public l3t0(vzl1 vzl1Var, String str, Boolean bool, int i, int i2) {
        this.a = vzl1Var;
        this.b = str;
        this.c = bool;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3t0)) {
            return false;
        }
        l3t0 l3t0Var = (l3t0) obj;
        return this.a.equals(l3t0Var.a) && u890.j(this.b, l3t0Var.b) && u890.j(this.c, l3t0Var.c) && this.d == l3t0Var.d && this.e == l3t0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return Integer.hashCode(this.e) + kaa0.f(this.d, (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31);
    }
}
