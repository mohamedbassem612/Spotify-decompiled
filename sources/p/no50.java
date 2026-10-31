package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class no50 extends po50 {
    public final boolean a;
    public final String b;
    public final List c;
    public final phx d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;

    public no50(boolean z, String str, List list, phx phxVar, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        this.a = z;
        this.b = str;
        this.c = list;
        this.d = phxVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = i;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no50)) {
            return false;
        }
        no50 no50Var = (no50) obj;
        return this.a == no50Var.a && u890.j(this.b, no50Var.b) && u890.j(this.c, no50Var.c) && u890.j(this.d, no50Var.d) && this.e == no50Var.e && this.f == no50Var.f && this.g == no50Var.g && this.h == no50Var.h && this.i == no50Var.i;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iB = f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        phx phxVar = this.d;
        return Boolean.hashCode(this.i) + kaa0.f(this.h, xcg1.g(xcg1.g(xcg1.g((iB + (phxVar != null ? phxVar.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g), 31);
    }
}
