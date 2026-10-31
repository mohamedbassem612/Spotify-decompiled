package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u9g {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public u9g(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9g)) {
            return false;
        }
        u9g u9gVar = (u9g) obj;
        return this.a == u9gVar.a && this.b == u9gVar.b && this.c == u9gVar.c && this.d == u9gVar.d && this.e == u9gVar.e && this.f == u9gVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
