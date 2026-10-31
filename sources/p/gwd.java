package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gwd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public gwd(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwd)) {
            return false;
        }
        gwd gwdVar = (gwd) obj;
        return u890.j(this.a, gwdVar.a) && u890.j(this.b, gwdVar.b) && u890.j(this.c, gwdVar.c) && u890.j(this.d, gwdVar.d) && u890.j(this.e, gwdVar.e) && u890.j(this.f, gwdVar.f) && this.g == gwdVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
