package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wge1 {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public wge1(float f, float f2, float f3, boolean z, boolean z2, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = i;
    }

    public static wge1 a(wge1 wge1Var, int i) {
        float f = wge1Var.a;
        float f2 = wge1Var.b;
        float f3 = wge1Var.c;
        boolean z = (i & 16) != 0 ? wge1Var.e : true;
        int i2 = wge1Var.f;
        wge1Var.getClass();
        return new wge1(f, f2, f3, true, z, i2);
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wge1)) {
            return false;
        }
        wge1 wge1Var = (wge1) obj;
        return Float.compare(this.a, wge1Var.a) == 0 && Float.compare(this.b, wge1Var.b) == 0 && Float.compare(this.c, wge1Var.c) == 0 && this.d == wge1Var.d && this.e == wge1Var.e && this.f == wge1Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + xcg1.g(xcg1.g(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
