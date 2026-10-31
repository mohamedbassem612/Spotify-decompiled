package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lz61 extends guo1 {
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final kz61 f;

    public lz61(String str, String str2, String str3, int i, kz61 kz61Var) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = kz61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz61)) {
            return false;
        }
        lz61 lz61Var = (lz61) obj;
        return u890.j(this.b, lz61Var.b) && u890.j(this.c, lz61Var.c) && u890.j(this.d, lz61Var.d) && this.e == lz61Var.e && u890.j(this.f, lz61Var.f);
    }

    public final int hashCode() {
        int iK = ab80.k(this.e, cy30.d(cy30.d(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
        kz61 kz61Var = this.f;
        return iK + (kz61Var == null ? 0 : kz61Var.hashCode());
    }
}
