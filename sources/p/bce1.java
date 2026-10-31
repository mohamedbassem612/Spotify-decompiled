package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bce1 implements cce1 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;

    public bce1(int i, int i2, int i3, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bce1)) {
            return false;
        }
        bce1 bce1Var = (bce1) obj;
        return this.a.equals(bce1Var.a) && this.b == bce1Var.b && this.c == bce1Var.c && this.d == bce1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
