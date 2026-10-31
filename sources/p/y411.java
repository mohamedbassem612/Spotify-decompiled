package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class y411 {
    public static final x411 Companion = new x411();
    public static final znb0[] h = {null, null, null, null, dm5.S(2, ijz0.V0), null, dm5.S(2, ijz0.W0)};
    public final String a;
    public final String b;
    public final String c;
    public final n411 d;
    public final List e;
    public final boolean f;
    public final List g;

    public y411(int i, String str, String str2, String str3, n411 n411Var, List list, boolean z, List list2) {
        if (35 != (i & 35)) {
            o6p1.t(i, 35, w411.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = n411Var;
        }
        int i2 = i & 16;
        z6x z6xVar = z6x.a;
        if (i2 == 0) {
            this.e = z6xVar;
        } else {
            this.e = list;
        }
        this.f = z;
        if ((i & 64) == 0) {
            this.g = z6xVar;
        } else {
            this.g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y411)) {
            return false;
        }
        y411 y411Var = (y411) obj;
        return u890.j(this.a, y411Var.a) && u890.j(this.b, y411Var.b) && u890.j(this.c, y411Var.c) && u890.j(this.d, y411Var.d) && u890.j(this.e, y411Var.e) && this.f == y411Var.f && u890.j(this.g, y411Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        n411 n411Var = this.d;
        return this.g.hashCode() + xcg1.g(f4i1.b((iHashCode + (n411Var != null ? n411Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }
}
