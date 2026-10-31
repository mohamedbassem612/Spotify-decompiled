package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l2h1 {
    public final lee1 a;
    public final lee1 b;
    public final lee1 c;
    public final lee1 d;
    public final lee1 e;
    public final lee1 f;
    public final lee1 g;

    public l2h1() {
        lee1 lee1Var = n2h1.a;
        lee1 lee1Var2 = n2h1.b;
        lee1 lee1Var3 = n2h1.c;
        lee1 lee1Var4 = n2h1.d;
        lee1 lee1Var5 = n2h1.e;
        lee1 lee1Var6 = n2h1.f;
        lee1 lee1Var7 = n2h1.g;
        shc0 shc0Var = p2h1.b;
        this.a = lee1Var;
        this.b = lee1Var2;
        this.c = lee1Var3;
        this.d = lee1Var4;
        this.e = lee1Var5;
        this.f = lee1Var6;
        this.g = lee1Var7;
    }

    public final lee1 a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2h1)) {
            return false;
        }
        l2h1 l2h1Var = (l2h1) obj;
        return u890.j(this.a, l2h1Var.a) && u890.j(this.b, l2h1Var.b) && u890.j(this.c, l2h1Var.c) && u890.j(this.d, l2h1Var.d) && u890.j(this.e, l2h1Var.e) && u890.j(this.f, l2h1Var.f) && u890.j(this.g, l2h1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + p3d1.h(this.f, p3d1.h(this.e, p3d1.h(this.d, p3d1.h(this.c, p3d1.h(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(titleLarge=" + this.a + ", titleMedium=" + this.b + ", titleSmall=" + this.c + ", bodyLarge=" + this.d + ", bodyMedium=" + this.e + ", bodySmall=" + this.f + ", caption=" + this.g + ")";
    }
}
