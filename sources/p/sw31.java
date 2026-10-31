package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sw31 {
    public final List a;
    public final boolean b;
    public final Map c;
    public final long d;
    public final boolean e;

    public sw31(List list, boolean z, Map map, long j, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = map;
        this.d = j;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw31)) {
            return false;
        }
        sw31 sw31Var = (sw31) obj;
        return u890.j(this.a, sw31Var.a) && this.b == sw31Var.b && u890.j(this.c, sw31Var.c) && this.d == sw31Var.d && this.e == sw31Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.f(cy30.e(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public /* synthetic */ sw31(List list, boolean z) {
        this(list, z, b7x.a, 0L, false);
    }
}
