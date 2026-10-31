package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cdz {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;

    public cdz(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdz)) {
            return false;
        }
        cdz cdzVar = (cdz) obj;
        return this.a.equals(cdzVar.a) && this.b.equals(cdzVar.b) && this.c == cdzVar.c && this.d.equals(cdzVar.d) && this.e == cdzVar.e && this.f.equals(cdzVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
