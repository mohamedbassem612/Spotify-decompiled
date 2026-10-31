package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e99 {
    public final s2c1 a;
    public final int b;
    public final boolean c;
    public final String d;

    public e99(s2c1 s2c1Var, int i, boolean z, String str) {
        this.a = s2c1Var;
        this.b = i;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e99)) {
            return false;
        }
        e99 e99Var = (e99) obj;
        return u890.j(this.a, e99Var.a) && this.b == e99Var.b && this.c == e99Var.c && this.d.equals(e99Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
