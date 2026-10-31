package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wde1 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final z0e1 e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public wde1(String str, int i, int i2, String str2, z0e1 z0e1Var, boolean z, boolean z2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z0e1Var;
        this.f = z;
        this.g = z2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wde1)) {
            return false;
        }
        wde1 wde1Var = (wde1) obj;
        return u890.j(this.a, wde1Var.a) && this.b == wde1Var.b && this.c == wde1Var.c && u890.j(this.d, wde1Var.d) && this.e.equals(wde1Var.e) && this.f == wde1Var.f && this.g == wde1Var.g && this.h == wde1Var.h;
    }

    public final int hashCode() {
        return l1d.C(this.h) + xcg1.g(xcg1.g((this.e.hashCode() + cy30.d(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d)) * 31, 31, this.f), 31, this.g);
    }
}
