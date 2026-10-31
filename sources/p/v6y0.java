package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v6y0 {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public v6y0(String str, int i, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static v6y0 a(v6y0 v6y0Var, boolean z, boolean z2, int i) {
        String str = v6y0Var.a;
        int i2 = (i & 2) != 0 ? v6y0Var.b : 2;
        if ((i & 4) != 0) {
            z = v6y0Var.c;
        }
        if ((i & 8) != 0) {
            z2 = v6y0Var.d;
        }
        return new v6y0(str, i2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6y0)) {
            return false;
        }
        v6y0 v6y0Var = (v6y0) obj;
        return u890.j(this.a, v6y0Var.a) && this.b == v6y0Var.b && this.c == v6y0Var.c && this.d == v6y0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
