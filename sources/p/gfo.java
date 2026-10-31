package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gfo {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public gfo(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfo)) {
            return false;
        }
        gfo gfoVar = (gfo) obj;
        return u890.j(this.a, gfoVar.a) && u890.j(this.b, gfoVar.b) && u890.j(this.c, gfoVar.c) && u890.j(this.d, gfoVar.d) && u890.j(this.e, gfoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
