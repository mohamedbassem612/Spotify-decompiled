package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vcl {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;

    public vcl(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = str6;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcl)) {
            return false;
        }
        vcl vclVar = (vcl) obj;
        return u890.j(this.a, vclVar.a) && u890.j(this.b, vclVar.b) && u890.j(this.c, vclVar.c) && u890.j(this.d, vclVar.d) && this.e == vclVar.e && u890.j(this.f, vclVar.f) && u890.j(this.g, vclVar.g) && this.h == vclVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + cy30.d(cy30.d(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
