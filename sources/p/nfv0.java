package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nfv0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final short g;

    public nfv0(int i, boolean z, boolean z2, boolean z3) {
        this(1, (i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfv0)) {
            return false;
        }
        nfv0 nfv0Var = (nfv0) obj;
        return this.a == nfv0Var.a && this.b == nfv0Var.b && this.c == nfv0Var.c && this.d == nfv0Var.d && this.e == nfv0Var.e && this.f == nfv0Var.f && this.g == nfv0Var.g;
    }

    public final int hashCode() {
        return (xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f) + this.g) * 31;
    }

    public nfv0(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = true;
        this.f = z4;
        this.g = (short) 1002;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nfv0(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        kiv kivVar = sy4.a;
        int i2 = !z ? 262152 : 262144;
        i2 = i == 2 ? i2 | SemanticState.Multiline : i2;
        this(z4 ? i2 : i2 | 512, i == 1, z2, z3, z5);
    }

    public nfv0(int i, boolean z, boolean z2) {
        this(i, z, true, true, z2, false);
    }
}
