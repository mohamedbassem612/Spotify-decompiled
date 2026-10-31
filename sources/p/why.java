package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class why {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;

    public why(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = i;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof why)) {
            return false;
        }
        why whyVar = (why) obj;
        return u890.j(this.a, whyVar.a) && u890.j(this.b, whyVar.b) && u890.j(this.c, whyVar.c) && u890.j(this.d, whyVar.d) && u890.j(this.e, whyVar.e) && u890.j(this.f, whyVar.f) && u890.j(this.g, whyVar.g) && this.h == whyVar.h && this.i == whyVar.i;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.i) + kaa0.f(this.h, cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31);
    }
}
