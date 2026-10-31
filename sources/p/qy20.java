package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qy20 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;

    public qy20(float f, float f2, float f3, float f4, boolean z, boolean z2, long j, long j2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
        this.f = z2;
        this.g = j;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy20)) {
            return false;
        }
        qy20 qy20Var = (qy20) obj;
        return Float.compare(this.a, qy20Var.a) == 0 && Float.compare(this.b, qy20Var.b) == 0 && Float.compare(this.c, qy20Var.c) == 0 && Float.compare(this.d, qy20Var.d) == 0 && this.e == qy20Var.e && this.f == qy20Var.f && yr80.b(this.g, qy20Var.g) && yr80.b(this.h, qy20Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + cy30.f(xcg1.g(xcg1.g(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), this.g, 31);
    }
}
