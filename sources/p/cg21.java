package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cg21 {
    public final int a;
    public final c380 b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ cg21(c380 c380Var, int i, String str, String str2, boolean z, int i2) {
        this(1, c380Var, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? false : z);
    }

    public static cg21 a(cg21 cg21Var, int i, c380 c380Var, int i2, String str, String str2, int i3) {
        if ((i3 & 1) != 0) {
            i = cg21Var.a;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = cg21Var.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = cg21Var.d;
        }
        String str3 = str;
        if ((i3 & 16) != 0) {
            str2 = cg21Var.e;
        }
        return new cg21(i4, c380Var, i5, str3, str2, (i3 & 32) != 0 ? cg21Var.f : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg21)) {
            return false;
        }
        cg21 cg21Var = (cg21) obj;
        return this.a == cg21Var.a && u890.j(this.b, cg21Var.b) && this.c == cg21Var.c && u890.j(this.d, cg21Var.d) && u890.j(this.e, cg21Var.e) && this.f == cg21Var.f;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kk0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public cg21(int i, c380 c380Var, int i2, String str, String str2, boolean z) {
        this.a = i;
        this.b = c380Var;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = z;
    }
}
