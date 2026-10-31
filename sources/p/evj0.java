package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class evj0 {
    public final int a;
    public final boolean b;
    public final ArrayList c;
    public final boolean d;

    public evj0(int i, boolean z, ArrayList arrayList, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = arrayList;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evj0)) {
            return false;
        }
        evj0 evj0Var = (evj0) obj;
        return this.a == evj0Var.a && this.b == evj0Var.b && this.c.equals(evj0Var.c) && this.d == evj0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p3d1.f(this.c, xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }
}
