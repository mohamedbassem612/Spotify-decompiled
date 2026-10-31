package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class w920 {
    public static final u920 Companion = new u920();
    public static final znb0[] g = {null, null, null, null, dm5.S(2, ny00.R0), dm5.S(2, ny00.S0)};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;

    public /* synthetic */ w920(int i, String str, String str2, String str3, String str4, List list, List list2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, t920.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w920)) {
            return false;
        }
        w920 w920Var = (w920) obj;
        return u890.j(this.a, w920Var.a) && u890.j(this.b, w920Var.b) && u890.j(this.c, w920Var.c) && u890.j(this.d, w920Var.d) && u890.j(this.e, w920Var.e) && u890.j(this.f, w920Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }
}
