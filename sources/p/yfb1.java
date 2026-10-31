package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yfb1 {
    public final zfb1 a;
    public final boolean b;
    public final r840 c;
    public final y4m d;
    public final boolean e;

    public yfb1(zfb1 zfb1Var, boolean z, r840 r840Var, y4m y4mVar, boolean z2) {
        this.a = zfb1Var;
        this.b = z;
        this.c = r840Var;
        this.d = y4mVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfb1)) {
            return false;
        }
        yfb1 yfb1Var = (yfb1) obj;
        return u890.j(this.a, yfb1Var.a) && this.b == yfb1Var.b && u890.j(this.c, yfb1Var.c) && u890.j(this.d, yfb1Var.d) && this.e == yfb1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }
}
