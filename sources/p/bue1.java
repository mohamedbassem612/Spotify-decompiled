package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bue1 {
    public final String a;
    public final uvg1 b;
    public final long c;
    public final float d;
    public final boolean e;
    public final List f;
    public final long g;
    public final long h;

    public bue1(String str, uvg1 uvg1Var, long j, float f, boolean z, List list, long j2, long j3) {
        this.a = str;
        this.b = uvg1Var;
        this.c = j;
        this.d = f;
        this.e = z;
        this.f = list;
        this.g = j2;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bue1)) {
            return false;
        }
        bue1 bue1Var = (bue1) obj;
        return u890.j(this.a, bue1Var.a) && u890.j(this.b, bue1Var.b) && this.c == bue1Var.c && Float.compare(this.d, bue1Var.d) == 0 && this.e == bue1Var.e && u890.j(this.f, bue1Var.f) && this.g == bue1Var.g && this.h == bue1Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + cy30.f(f4i1.b(xcg1.g(x0d.f(cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31, this.d), 31, this.e), 31, this.f), this.g, 31);
    }
}
