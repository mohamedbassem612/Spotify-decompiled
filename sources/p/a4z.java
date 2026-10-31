package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a4z {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public a4z(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
        if (!(obj instanceof a4z)) {
            return false;
        }
        a4z a4zVar = (a4z) obj;
        return u890.j(this.a, a4zVar.a) && u890.j(this.b, a4zVar.b) && u890.j(this.c, a4zVar.c) && u890.j(this.d, a4zVar.d) && u890.j(this.e, a4zVar.e) && u890.j(this.f, a4zVar.f) && u890.j(this.g, a4zVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
