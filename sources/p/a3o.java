package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a3o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public a3o(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof a3o)) {
            return false;
        }
        a3o a3oVar = (a3o) obj;
        return this.a.equals(a3oVar.a) && this.b.equals(a3oVar.b) && this.c.equals(a3oVar.c) && this.d.equals(a3oVar.d) && this.e.equals(a3oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
