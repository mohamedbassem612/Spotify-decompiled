package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ha10 {
    public final tnj0 a;
    public final String b;
    public final String c;

    public ha10(tnj0 tnj0Var, String str, String str2) {
        this.a = tnj0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha10)) {
            return false;
        }
        ha10 ha10Var = (ha10) obj;
        return u890.j(this.a, ha10Var.a) && u890.j(this.b, ha10Var.b) && u890.j(this.c, ha10Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
