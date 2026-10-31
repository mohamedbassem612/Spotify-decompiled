package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ffv0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public ffv0(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffv0)) {
            return false;
        }
        ffv0 ffv0Var = (ffv0) obj;
        return this.a == ffv0Var.a && this.b == ffv0Var.b && this.c == ffv0Var.c && this.d == ffv0Var.d && Float.compare(this.e, ffv0Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, l1d.C(this.a) * 31, 31), 31), 31);
    }
}
