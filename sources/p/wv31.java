package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wv31 implements bw31, ov31, vu31 {
    public final yh90 a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final nv31 h;
    public final int i;

    public wv31(yh90 yh90Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, nv31 nv31Var, int i) {
        String str = yh90Var.a;
        this.a = yh90Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = nv31Var;
        this.i = i;
    }

    public final int a() {
        return this.i;
    }

    public final nv31 b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv31)) {
            return false;
        }
        wv31 wv31Var = (wv31) obj;
        return this.a.equals(wv31Var.a) && this.b == wv31Var.b && this.c == wv31Var.c && this.d.equals(wv31Var.d) && this.e == wv31Var.e && this.f == wv31Var.f && this.g == wv31Var.g && this.h.equals(wv31Var.h) && this.i == wv31Var.i;
    }

    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return l1d.C(this.i) + ((this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(cy30.d(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }
}
