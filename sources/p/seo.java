package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class seo {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public seo(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof seo)) {
            return false;
        }
        seo seoVar = (seo) obj;
        return this.a.equals(seoVar.a) && this.b.equals(seoVar.b) && this.c.equals(seoVar.c) && this.d.equals(seoVar.d) && this.e.equals(seoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
