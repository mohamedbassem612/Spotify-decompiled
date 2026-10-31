package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n140 {
    public final String a;
    public final int b;
    public final int c;
    public final z040 d;
    public final boolean e;

    public n140(String str, int i, int i2, z040 z040Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z040Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n140)) {
            return false;
        }
        n140 n140Var = (n140) obj;
        return u890.j(this.a, n140Var.a) && this.b == n140Var.b && this.c == n140Var.c && this.d.equals(n140Var.d) && this.e == n140Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }
}
