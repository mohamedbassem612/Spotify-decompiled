package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d64 {
    public final String a;
    public final String b;
    public final Long c;
    public final boolean d;

    public d64(Long l, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d64)) {
            return false;
        }
        d64 d64Var = (d64) obj;
        return u890.j(this.a, d64Var.a) && u890.j(this.b, d64Var.b) && u890.j(this.c, d64Var.c) && this.d == d64Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }
}
