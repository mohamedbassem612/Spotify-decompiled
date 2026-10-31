package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uu31 implements aw31 {
    public final int a;
    public final String b;
    public final int c;
    public final z0e1 d;
    public final boolean e;

    public uu31(int i, int i2, String str, z0e1 z0e1Var, boolean z) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z0e1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu31)) {
            return false;
        }
        uu31 uu31Var = (uu31) obj;
        return this.a == uu31Var.a && u890.j(this.b, uu31Var.b) && this.c == uu31Var.c && this.d.equals(uu31Var.d) && this.e == uu31Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + kaa0.f(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31)) * 31);
    }

    @Override // p.aw31
    public final int p() {
        return this.a;
    }
}
