package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yh10 {
    public final String a;
    public final String b;
    public final String c;
    public final ugo0 d;
    public final boolean e;

    public yh10(String str, String str2, String str3, ugo0 ugo0Var, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        ugo0Var = (i & 8) != 0 ? new ugo0(false, null, null, false, false, null, null, 511) : ugo0Var;
        boolean z = (i & 16) != 0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ugo0Var;
        this.e = z;
    }

    public final String a() {
        return this.b;
    }

    public final ugo0 b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh10)) {
            return false;
        }
        yh10 yh10Var = (yh10) obj;
        return u890.j(this.a, yh10Var.a) && u890.j(this.b, yh10Var.b) && u890.j(this.c, yh10Var.c) && this.d.equals(yh10Var.d) && this.e == yh10Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
