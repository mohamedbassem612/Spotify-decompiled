package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dky {
    public final boolean a;
    public final boolean b;
    public final float c;
    public final int d;
    public final int e;

    public /* synthetic */ dky(boolean z, boolean z2, float f, int i, int i2, l1d l1dVar) {
        this(z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 3 : i, 1);
    }

    public static dky a(dky dkyVar) {
        return new dky(dkyVar.a, dkyVar.b, dkyVar.c, dkyVar.d, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dky)) {
            return false;
        }
        dky dkyVar = (dky) obj;
        return this.a == dkyVar.a && this.b == dkyVar.b && Float.compare(this.c, dkyVar.c) == 0 && this.d == dkyVar.d && this.e == dkyVar.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + ab80.k(this.d, x0d.f(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public dky(boolean z, boolean z2, float f, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = i;
        this.e = i2;
    }
}
