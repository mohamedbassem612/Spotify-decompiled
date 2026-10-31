package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s371 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public s371(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s371)) {
            return false;
        }
        s371 s371Var = (s371) obj;
        return u890.j(this.a, s371Var.a) && u890.j(this.b, s371Var.b) && u890.j(this.c, s371Var.c) && this.d == s371Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public /* synthetic */ s371(String str, String str2, int i, String str3) {
        this(str, (i & 2) != 0 ? null : str2, str3, false);
    }
}
