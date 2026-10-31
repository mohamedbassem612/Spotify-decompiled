package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lc40 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Integer e;

    public lc40(Integer num, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc40)) {
            return false;
        }
        lc40 lc40Var = (lc40) obj;
        return this.a.equals(lc40Var.a) && this.b.equals(lc40Var.b) && this.c.equals(lc40Var.c) && this.d == lc40Var.d && u890.j(this.e, lc40Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
