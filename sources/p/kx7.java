package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kx7 {
    public final String a;
    public final String b;
    public final boolean c;
    public final luq0 d;
    public final up7 e;

    public kx7(String str, String str2, boolean z, luq0 luq0Var, up7 up7Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = luq0Var;
        this.e = up7Var;
    }

    public static kx7 a(kx7 kx7Var, boolean z) {
        String str = kx7Var.a;
        String str2 = kx7Var.b;
        luq0 luq0Var = kx7Var.d;
        up7 up7Var = kx7Var.e;
        kx7Var.getClass();
        return new kx7(str, str2, z, luq0Var, up7Var);
    }

    public final boolean b() {
        return this.d == luq0.BUILT_IN_SPEAKER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx7)) {
            return false;
        }
        kx7 kx7Var = (kx7) obj;
        return this.a.equals(kx7Var.a) && this.b.equals(kx7Var.b) && this.c == kx7Var.c && this.d == kx7Var.d && u890.j(this.e, kx7Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        up7 up7Var = this.e;
        return iHashCode + (up7Var == null ? 0 : up7Var.hashCode());
    }
}
