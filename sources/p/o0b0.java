package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o0b0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Long e;

    public o0b0(Long l, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0b0)) {
            return false;
        }
        o0b0 o0b0Var = (o0b0) obj;
        return u890.j(this.a, o0b0Var.a) && u890.j(this.b, o0b0Var.b) && u890.j(this.c, o0b0Var.c) && this.d == o0b0Var.d && u890.j(this.e, o0b0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iG = xcg1.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        Long l = this.e;
        return iG + (l != null ? l.hashCode() : 0);
    }
}
