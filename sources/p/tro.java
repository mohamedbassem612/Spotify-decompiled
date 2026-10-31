package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tro {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public tro(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tro)) {
            return false;
        }
        tro troVar = (tro) obj;
        return u890.j(this.a, troVar.a) && u890.j(this.b, troVar.b) && u890.j(this.c, troVar.c) && this.d.equals(troVar.d) && this.e == troVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
