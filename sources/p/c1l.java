package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c1l {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public c1l(int i, String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1l)) {
            return false;
        }
        c1l c1lVar = (c1l) obj;
        return this.a.equals(c1lVar.a) && this.b == c1lVar.b && this.c == c1lVar.c && this.d == c1lVar.d && this.e == c1lVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(ab80.k(this.b, this.a.hashCode() * 961, 31), 31, this.c), 31, this.d);
    }
}
