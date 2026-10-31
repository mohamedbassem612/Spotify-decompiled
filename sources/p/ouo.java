package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ouo {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ouo(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouo)) {
            return false;
        }
        ouo ouoVar = (ouo) obj;
        return this.a.equals(ouoVar.a) && this.b.equals(ouoVar.b) && u890.j(this.c, ouoVar.c) && this.d == ouoVar.d && this.e == ouoVar.e && this.f == ouoVar.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
