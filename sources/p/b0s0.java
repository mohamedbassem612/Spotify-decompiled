package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b0s0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public b0s0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0s0)) {
            return false;
        }
        b0s0 b0s0Var = (b0s0) obj;
        return u890.j(this.a, b0s0Var.a) && u890.j(this.b, b0s0Var.b) && u890.j(this.c, b0s0Var.c) && this.d == b0s0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
