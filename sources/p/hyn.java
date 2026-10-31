package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hyn {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public hyn(int i, int i2, int i3, boolean z, boolean z2) {
        z = (i3 & 4) != 0 ? false : z;
        z2 = (i3 & 8) != 0 ? false : z2;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyn)) {
            return false;
        }
        hyn hynVar = (hyn) obj;
        return this.a == hynVar.a && this.b == hynVar.b && this.c == hynVar.c && this.d == hynVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(ab80.k(this.b, l1d.C(this.a) * 31, 31), 31, this.c);
    }
}
