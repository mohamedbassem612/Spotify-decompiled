package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bom {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public bom(boolean z, boolean z2, boolean z3, long j) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
    }

    public static bom a(bom bomVar, boolean z, boolean z2, boolean z3, long j, int i) {
        if ((i & 1) != 0) {
            z = bomVar.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = bomVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = bomVar.c;
        }
        bomVar.getClass();
        return new bom(z4, z5, z3, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bom)) {
            return false;
        }
        bom bomVar = (bom) obj;
        return this.a == bomVar.a && this.b == bomVar.b && this.c == bomVar.c && this.d == bomVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
