package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d5a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public d5a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5a)) {
            return false;
        }
        d5a d5aVar = (d5a) obj;
        return this.a.equals(d5aVar.a) && this.b.equals(d5aVar.b) && this.c.equals(d5aVar.c) && this.d.equals(d5aVar.d) && this.e.equals(d5aVar.e) && this.f.equals(d5aVar.f) && this.g.equals(d5aVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
