package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wco {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Integer g;

    public wco(String str, String str2, String str3, String str4, String str5, boolean z, Integer num, int i) {
        z = (i & 32) != 0 ? true : z;
        num = (i & 64) != 0 ? null : num;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wco)) {
            return false;
        }
        wco wcoVar = (wco) obj;
        return u890.j(this.a, wcoVar.a) && u890.j(this.b, wcoVar.b) && this.c.equals(wcoVar.c) && this.d.equals(wcoVar.d) && this.e.equals(wcoVar.e) && this.f == wcoVar.f && u890.j(this.g, wcoVar.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.g;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
