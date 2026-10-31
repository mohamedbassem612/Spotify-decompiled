package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xi50 {
    public final String a;
    public final boolean b;
    public final c380 c;

    public xi50(String str, c380 c380Var, boolean z) {
        this.a = str;
        this.b = z;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi50)) {
            return false;
        }
        xi50 xi50Var = (xi50) obj;
        return u890.j(this.a, xi50Var.a) && this.b == xi50Var.b && u890.j(this.c, xi50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
