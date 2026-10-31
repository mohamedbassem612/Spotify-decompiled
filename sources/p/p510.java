package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class p510 {
    public static final o510 Companion = new o510();
    public static final znb0[] j = {null, null, null, null, dm5.S(2, ny00.f), null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final rz0 g;
    public final String h;
    public final hh31 i;

    public /* synthetic */ p510(int i, String str, String str2, String str3, String str4, List list, String str5, rz0 rz0Var, String str6, hh31 hh31Var) {
        if (19 != (i & 19)) {
            o6p1.t(i, 19, n510.a.getDescriptor());
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
            this.d = str4;
        }
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = rz0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = hh31Var;
        }
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p510)) {
            return false;
        }
        p510 p510Var = (p510) obj;
        return u890.j(this.a, p510Var.a) && u890.j(this.b, p510Var.b) && u890.j(this.c, p510Var.c) && u890.j(this.d, p510Var.d) && u890.j(this.e, p510Var.e) && u890.j(this.f, p510Var.f) && u890.j(this.g, p510Var.g) && u890.j(this.h, p510Var.h) && u890.j(this.i, p510Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iB = f4i1.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int iHashCode2 = (iB + (str3 == null ? 0 : str3.hashCode())) * 31;
        rz0 rz0Var = this.g;
        int iHashCode3 = (iHashCode2 + (rz0Var == null ? 0 : rz0Var.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        hh31 hh31Var = this.i;
        return iHashCode4 + (hh31Var != null ? hh31Var.hashCode() : 0);
    }

    public p510(String str, String str2, String str3, String str4, List list, String str5, rz0 rz0Var, String str6, hh31 hh31Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
        this.g = rz0Var;
        this.h = str6;
        this.i = hh31Var;
    }
}
