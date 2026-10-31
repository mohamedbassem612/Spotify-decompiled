package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z301 {
    public final String a;
    public final c380 b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public /* synthetic */ z301(String str, c380 c380Var, int i, String str2, String str3, boolean z, int i2, int i3) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? mqo1.A(z6x.a) : c380Var, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? 0 : i2, true);
    }

    public static z301 a(z301 z301Var, int i, String str) {
        String str2 = z301Var.a;
        c380 c380Var = z301Var.b;
        String str3 = z301Var.e;
        boolean z = z301Var.f;
        int i2 = z301Var.g;
        boolean z2 = z301Var.h;
        z301Var.getClass();
        return new z301(str2, c380Var, i, str, str3, z, i2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z301)) {
            return false;
        }
        z301 z301Var = (z301) obj;
        return u890.j(this.a, z301Var.a) && u890.j(this.b, z301Var.b) && this.c == z301Var.c && u890.j(this.d, z301Var.d) && u890.j(this.e, z301Var.e) && this.f == z301Var.f && this.g == z301Var.g && this.h == z301Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + kaa0.f(this.g, xcg1.g(cy30.d(cy30.d(kaa0.f(this.c, kk0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public z301(String str, c380 c380Var, int i, String str2, String str3, boolean z, int i2, boolean z2) {
        this.a = str;
        this.b = c380Var;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = i2;
        this.h = z2;
    }
}
