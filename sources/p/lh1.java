package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lh1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final p10 e;
    public final boolean f;

    public lh1(String str, String str2, String str3, String str4, p10 p10Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = p10Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh1)) {
            return false;
        }
        lh1 lh1Var = (lh1) obj;
        return this.a.equals(lh1Var.a) && this.b.equals(lh1Var.b) && this.c.equals(lh1Var.c) && this.d.equals(lh1Var.d) && this.e.equals(lh1Var.e) && this.f == lh1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }
}
