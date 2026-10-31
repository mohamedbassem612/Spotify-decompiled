package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class in51 {
    public static final hn51 Companion = new hn51();
    public static final znb0[] j = {null, null, null, null, null, null, null, dm5.S(2, oa41.V0), null};
    public final String a;
    public final Integer b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final List h;
    public final lk30 i;

    public /* synthetic */ in51(int i, String str, Integer num, String str2, int i2, int i3, int i4, int i5, List list, lk30 lk30Var) {
        if (381 != (i & 381)) {
            o6p1.t(i, 381, gn51.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = num;
        }
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        this.i = lk30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in51)) {
            return false;
        }
        in51 in51Var = (in51) obj;
        return u890.j(this.a, in51Var.a) && u890.j(this.b, in51Var.b) && u890.j(this.c, in51Var.c) && this.d == in51Var.d && this.e == in51Var.e && this.f == in51Var.f && this.g == in51Var.g && u890.j(this.h, in51Var.h) && u890.j(this.i, in51Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iF = kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, cy30.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31), 31), 31), 31);
        List list = this.h;
        return this.i.a.hashCode() + ((iF + (list != null ? list.hashCode() : 0)) * 31);
    }
}
