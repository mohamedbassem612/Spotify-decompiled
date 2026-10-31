package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gcu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public gcu(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static gcu a(gcu gcuVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = gcuVar.a;
        }
        if ((i & 2) != 0) {
            z2 = gcuVar.b;
        }
        return new gcu(z, z2, gcuVar.c, gcuVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcu)) {
            return false;
        }
        gcu gcuVar = (gcu) obj;
        return this.a == gcuVar.a && this.b == gcuVar.b && this.c == gcuVar.c && this.d == gcuVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
