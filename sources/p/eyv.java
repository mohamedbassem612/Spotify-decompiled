package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eyv {
    public final Set a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public eyv(Set set, boolean z, boolean z2, boolean z3) {
        this.a = set;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static eyv a(eyv eyvVar, Set set, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            set = eyvVar.a;
        }
        if ((i & 2) != 0) {
            z = eyvVar.b;
        }
        if ((i & 4) != 0) {
            z2 = eyvVar.c;
        }
        if ((i & 8) != 0) {
            z3 = eyvVar.d;
        }
        return new eyv(set, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyv)) {
            return false;
        }
        eyv eyvVar = (eyv) obj;
        return u890.j(this.a, eyvVar.a) && this.b == eyvVar.b && this.c == eyvVar.c && this.d == eyvVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
