package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n73 {
    public final y73 a;
    public final boolean b;
    public final vum1 c;
    public final wg7 d;
    public final boolean e;

    public n73(y73 y73Var, boolean z, vum1 vum1Var, wg7 wg7Var, boolean z2) {
        this.a = y73Var;
        this.b = z;
        this.c = vum1Var;
        this.d = wg7Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n73)) {
            return false;
        }
        n73 n73Var = (n73) obj;
        return u890.j(this.a, n73Var.a) && this.b == n73Var.b && u890.j(this.c, n73Var.c) && u890.j(this.d, n73Var.d) && this.e == n73Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }
}
