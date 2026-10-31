package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hwt {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public hwt(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwt)) {
            return false;
        }
        hwt hwtVar = (hwt) obj;
        return this.a == hwtVar.a && this.b == hwtVar.b && this.c == hwtVar.c && this.d == hwtVar.d && this.e == hwtVar.e && this.f == hwtVar.f && this.g == hwtVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
