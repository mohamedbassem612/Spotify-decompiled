package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kcz0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public kcz0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcz0)) {
            return false;
        }
        kcz0 kcz0Var = (kcz0) obj;
        return u890.j(this.a, kcz0Var.a) && u890.j(this.b, kcz0Var.b) && u890.j(this.c, kcz0Var.c) && u890.j(this.d, kcz0Var.d) && this.e == kcz0Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
