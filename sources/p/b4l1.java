package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class b4l1 extends l4l1 {
    public static final a4l1 Companion = new a4l1();
    public static final znb0[] l = {null, null, null, null, null, dm5.S(2, w3l1.d), null, null, null, null};
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final String i;
    public final Boolean j;
    public final String k;

    public /* synthetic */ b4l1(int i, int i2, String str, String str2, String str3, String str4, List list, String str5, String str6, Boolean bool, String str7) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, z3l1.a.getDescriptor());
            throw null;
        }
        this.b = i2;
        this.c = str;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = bool;
        }
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4l1)) {
            return false;
        }
        b4l1 b4l1Var = (b4l1) obj;
        return this.b == b4l1Var.b && u890.j(this.c, b4l1Var.c) && u890.j(this.d, b4l1Var.d) && u890.j(this.e, b4l1Var.e) && u890.j(this.f, b4l1Var.f) && u890.j(this.g, b4l1Var.g) && u890.j(this.h, b4l1Var.h) && u890.j(this.i, b4l1Var.i) && u890.j(this.j, b4l1Var.j) && u890.j(this.k, b4l1Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(Integer.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.g;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.k;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }
}
