package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jen {
    public final String a;
    public final int b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;

    public jen(String str, int i, long j, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jen)) {
            return false;
        }
        jen jenVar = (jen) obj;
        return this.a.equals(jenVar.a) && this.b == jenVar.b && this.c == jenVar.c && u890.j(this.d, jenVar.d) && u890.j(this.e, jenVar.e) && u890.j(this.f, jenVar.f) && u890.j(this.g, jenVar.g);
    }

    public final int hashCode() {
        int iF = cy30.f(ab80.k(this.b, this.a.hashCode() * 31, 31), this.c, 31);
        String str = this.d;
        int iD = cy30.d(cy30.d((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        Long l = this.g;
        return iD + (l != null ? l.hashCode() : 0);
    }
}
