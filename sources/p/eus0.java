package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eus0 {
    public final List a;
    public final m0d b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public /* synthetic */ eus0(int i) {
        this(z6x.a, null, (i & 4) != 0, false, 0);
    }

    public static eus0 a(eus0 eus0Var, List list, m0d m0dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = eus0Var.a;
        }
        List list2 = list;
        boolean z = (i2 & 4) != 0 ? eus0Var.c : false;
        boolean z2 = (i2 & 8) != 0 ? eus0Var.d : true;
        if ((i2 & 16) != 0) {
            i = eus0Var.e;
        }
        return new eus0(list2, m0dVar, z, z2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eus0)) {
            return false;
        }
        eus0 eus0Var = (eus0) obj;
        return u890.j(this.a, eus0Var.a) && u890.j(this.b, eus0Var.b) && this.c == eus0Var.c && this.d == eus0Var.d && this.e == eus0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m0d m0dVar = this.b;
        int iG = xcg1.g(xcg1.g((iHashCode + (m0dVar == null ? 0 : m0dVar.hashCode())) * 31, 31, this.c), 31, this.d);
        int i = this.e;
        return iG + (i != 0 ? l1d.C(i) : 0);
    }

    public eus0(List list, m0d m0dVar, boolean z, boolean z2, int i) {
        this.a = list;
        this.b = m0dVar;
        this.c = z;
        this.d = z2;
        this.e = i;
    }
}
