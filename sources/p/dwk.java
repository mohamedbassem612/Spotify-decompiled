package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dwk implements fxk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final h290 e;

    public dwk(String str, String str2, String str3, String str4, h290 h290Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwk)) {
            return false;
        }
        dwk dwkVar = (dwk) obj;
        return this.a.equals(dwkVar.a) && this.b.equals(dwkVar.b) && this.c.equals(dwkVar.c) && this.d.equals(dwkVar.d) && this.e.equals(dwkVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
