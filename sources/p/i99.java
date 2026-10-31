package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i99 {
    public final p7t0 a;
    public final int b;
    public final boolean c;
    public final String d;

    public i99(p7t0 p7t0Var, int i, boolean z, String str) {
        this.a = p7t0Var;
        this.b = i;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i99)) {
            return false;
        }
        i99 i99Var = (i99) obj;
        return u890.j(this.a, i99Var.a) && this.b == i99Var.b && this.c == i99Var.c && this.d.equals(i99Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
