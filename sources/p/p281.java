package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p281 extends e6p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public p281(String str, String str2, String str3, String str4, boolean z) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p281)) {
            return false;
        }
        p281 p281Var = (p281) obj;
        return this.c.equals(p281Var.c) && this.d.equals(p281Var.d) && this.e.equals(p281Var.e) && this.f.equals(p281Var.f) && this.g == p281Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + cy30.d(cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
