package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class u6k1 {
    public static final t6k1 Companion = new t6k1();
    public static final znb0[] h = {null, null, null, dm5.S(2, kvj1.g), dm5.S(2, kvj1.h), null, null};
    public final String a;
    public final String b;
    public final szh c;
    public final List d;
    public final List e;
    public final String f;
    public final uga0 g;

    public /* synthetic */ u6k1(int i, String str, String str2, szh szhVar, List list, List list2, String str3, uga0 uga0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = szhVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = uga0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6k1)) {
            return false;
        }
        u6k1 u6k1Var = (u6k1) obj;
        return u890.j(this.a, u6k1Var.a) && u890.j(this.b, u6k1Var.b) && u890.j(this.c, u6k1Var.c) && u890.j(this.d, u6k1Var.d) && u890.j(this.e, u6k1Var.e) && u890.j(this.f, u6k1Var.f) && u890.j(this.g, u6k1Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        szh szhVar = this.c;
        int iHashCode3 = (iHashCode2 + (szhVar == null ? 0 : szhVar.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        uga0 uga0Var = this.g;
        return iHashCode6 + (uga0Var != null ? uga0Var.a.hashCode() : 0);
    }
}
