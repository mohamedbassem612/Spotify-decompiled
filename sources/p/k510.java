package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class k510 {
    public static final j510 Companion = new j510();
    public static final znb0[] g = {null, dm5.S(2, ny00.e), null, null, null, null};
    public final q210 a;
    public final List b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final boolean f;

    public /* synthetic */ k510(int i, q210 q210Var, List list, String str, String str2, Boolean bool, boolean z) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, i510.a.getDescriptor());
            throw null;
        }
        this.a = q210Var;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = Boolean.FALSE;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k510)) {
            return false;
        }
        k510 k510Var = (k510) obj;
        return u890.j(this.a, k510Var.a) && u890.j(this.b, k510Var.b) && u890.j(this.c, k510Var.c) && u890.j(this.d, k510Var.d) && u890.j(this.e, k510Var.e) && this.f == k510Var.f;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public k510(q210 q210Var, String str, String str2, Boolean bool, boolean z) {
        this.a = q210Var;
        this.b = z6x.a;
        this.c = str;
        this.d = str2;
        this.e = bool;
        this.f = z;
    }

    public /* synthetic */ k510(q210 q210Var, String str, Boolean bool) {
        this(q210Var, null, str, bool, false);
    }
}
