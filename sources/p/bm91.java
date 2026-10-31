package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bm91 {
    public final rp91 a;
    public final rp91 b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public bm91(rp91 rp91Var, rp91 rp91Var2, int i, boolean z, boolean z2) {
        this.a = rp91Var;
        this.b = rp91Var2;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm91)) {
            return false;
        }
        bm91 bm91Var = (bm91) obj;
        return this.a == bm91Var.a && this.b == bm91Var.b && this.c == bm91Var.c && this.d == bm91Var.d && this.e == bm91Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, true);
    }
}
