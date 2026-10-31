package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hv31 implements aw31 {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;

    public hv31(int i, boolean z, String str, int i2, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv31)) {
            return false;
        }
        hv31 hv31Var = (hv31) obj;
        return this.a == hv31Var.a && u890.j(this.b, hv31Var.b) && this.c == hv31Var.c && u890.j(this.d, hv31Var.d) && this.e == hv31Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(kaa0.f(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    @Override // p.aw31
    public final int p() {
        return this.a;
    }
}
