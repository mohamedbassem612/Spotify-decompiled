package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nee0 {
    public final boolean a;
    public final boolean b;
    public final int c;

    public nee0(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public static nee0 a(nee0 nee0Var, boolean z, int i, int i2) {
        boolean z2 = (i2 & 1) != 0 ? nee0Var.a : false;
        if ((i2 & 2) != 0) {
            z = nee0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = nee0Var.c;
        }
        return new nee0(z2, z, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nee0)) {
            return false;
        }
        nee0 nee0Var = (nee0) obj;
        return this.a == nee0Var.a && this.b == nee0Var.b && this.c == nee0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
