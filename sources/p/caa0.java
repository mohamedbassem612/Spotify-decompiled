package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class caa0 {
    public static final baa0 Companion = new baa0();
    public static final znb0[] h = {null, null, null, dm5.S(2, lx70.W0), null, null, dm5.S(2, lx70.X0)};
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final List g;

    public /* synthetic */ caa0(int i, String str, String str2, String str3, List list, String str4, String str5, List list2) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, aaa0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof caa0)) {
            return false;
        }
        caa0 caa0Var = (caa0) obj;
        return u890.j(this.a, caa0Var.a) && u890.j(this.b, caa0Var.b) && u890.j(this.c, caa0Var.c) && u890.j(this.d, caa0Var.d) && u890.j(this.e, caa0Var.e) && u890.j(this.f, caa0Var.f) && u890.j(this.g, caa0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.g;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public caa0(String str, String str2, String str3, String str4, String str5, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
        this.g = list2;
    }
}
