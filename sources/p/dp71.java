package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dp71 implements fp71 {
    public final c380 a;
    public final t7q0 b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public dp71(c380 c380Var, t7q0 t7q0Var, int i, boolean z, boolean z2) {
        this.a = c380Var;
        this.b = t7q0Var;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    public static dp71 c(dp71 dp71Var, c9 c9Var, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            c9Var = dp71Var.a;
        }
        c9 c9Var2 = c9Var;
        t7q0 t7q0Var = dp71Var.b;
        if ((i2 & 8) != 0) {
            z = dp71Var.d;
        }
        return new dp71(c9Var2, t7q0Var, i, z, dp71Var.e);
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp71)) {
            return false;
        }
        dp71 dp71Var = (dp71) obj;
        return u890.j(this.a, dp71Var.a) && u890.j(this.b, dp71Var.b) && this.c == dp71Var.c && this.d == dp71Var.d && this.e == dp71Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
    }
}
