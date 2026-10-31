package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class hnc0 {
    public static final gnc0 Companion = new gnc0();
    public static final znb0[] f = {null, dm5.S(2, lx70.e1), dm5.S(2, fnc0.b), null, null};
    public final String a;
    public final List b;
    public final List c;
    public final String d;
    public final r2d1 e;

    public /* synthetic */ hnc0(int i, String str, List list, List list2, String str2, r2d1 r2d1Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        int i2 = i & 2;
        z6x z6xVar = z6x.a;
        if (i2 == 0) {
            this.b = z6xVar;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = z6xVar;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = r2d1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnc0)) {
            return false;
        }
        hnc0 hnc0Var = (hnc0) obj;
        return u890.j(this.a, hnc0Var.a) && u890.j(this.b, hnc0Var.b) && u890.j(this.c, hnc0Var.c) && u890.j(this.d, hnc0Var.d) && u890.j(this.e, hnc0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iB = f4i1.b(f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        r2d1 r2d1Var = this.e;
        return iHashCode + (r2d1Var != null ? r2d1Var.hashCode() : 0);
    }
}
