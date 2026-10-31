package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class noa1 implements z460 {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final int d;

    public noa1(int i, int i2, String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
    }

    @Override // p.z460
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noa1)) {
            return false;
        }
        noa1 noa1Var = (noa1) obj;
        return u890.j(this.a, noa1Var.a) && this.b.equals(noa1Var.b) && this.c == noa1Var.c && this.d == noa1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
