package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b7l {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public b7l(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = z4;
        this.f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7l)) {
            return false;
        }
        b7l b7lVar = (b7l) obj;
        return this.a == b7lVar.a && this.b == b7lVar.b && this.c == b7lVar.c && this.d == b7lVar.d && this.e == b7lVar.e && this.f == b7lVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(kaa0.f(this.d, xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }
}
