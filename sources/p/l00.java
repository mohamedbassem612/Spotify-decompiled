package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l00 implements n10 {
    public final uvg1 a;
    public final long b;
    public final float c;
    public final boolean d;
    public final List e;
    public final long f;
    public final long g;

    public l00(uvg1 uvg1Var, long j, float f, boolean z, List list, long j2, long j3) {
        this.a = uvg1Var;
        this.b = j;
        this.c = f;
        this.d = z;
        this.e = list;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l00)) {
            return false;
        }
        l00 l00Var = (l00) obj;
        return u890.j(this.a, l00Var.a) && this.b == l00Var.b && Float.compare(this.c, l00Var.c) == 0 && this.d == l00Var.d && u890.j(this.e, l00Var.e) && this.f == l00Var.f && this.g == l00Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + cy30.f(f4i1.b(xcg1.g(x0d.f(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e), this.f, 31);
    }
}
