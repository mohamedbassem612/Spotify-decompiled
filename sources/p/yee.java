package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yee {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public yee(boolean z, boolean z2, boolean z3, String str, int i, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public static yee a(yee yeeVar, boolean z) {
        return new yee(yeeVar.a, z, yeeVar.c, yeeVar.d, yeeVar.e, yeeVar.f, yeeVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yee)) {
            return false;
        }
        yee yeeVar = (yee) obj;
        return this.a == yeeVar.a && this.b == yeeVar.b && this.c == yeeVar.c && this.d.equals(yeeVar.d) && this.e == yeeVar.e && this.f == yeeVar.f && this.g == yeeVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + kaa0.f(this.f, kaa0.f(this.e, cy30.d(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }
}
