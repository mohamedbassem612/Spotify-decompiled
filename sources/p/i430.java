package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i430 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public /* synthetic */ i430(String str, int i, boolean z) {
        this(0, 0, str, false, (i & 4) != 0 ? false : z);
    }

    public static i430 a(i430 i430Var, boolean z) {
        return new i430(i430Var.d, i430Var.e, i430Var.a, i430Var.b, z);
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i430)) {
            return false;
        }
        i430 i430Var = (i430) obj;
        return u890.j(this.a, i430Var.a) && this.b == i430Var.b && this.c == i430Var.c && this.d == i430Var.d && this.e == i430Var.e;
    }

    public final boolean f() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + kaa0.f(this.d, xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public i430(int i, int i2, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
    }
}
