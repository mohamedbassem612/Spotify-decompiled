package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class dvy0 {
    public static final bvy0 Companion = new bvy0();
    public static final znb0[] h = {null, null, null, null, null, null, dm5.S(2, h0x0.W0)};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;

    public /* synthetic */ dvy0(int i, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        if (4 != (i & 4)) {
            o6p1.t(i, 4, avy0.a.getDescriptor());
            throw null;
        }
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
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvy0)) {
            return false;
        }
        dvy0 dvy0Var = (dvy0) obj;
        return u890.j(this.a, dvy0Var.a) && u890.j(this.b, dvy0Var.b) && u890.j(this.c, dvy0Var.c) && u890.j(this.d, dvy0Var.d) && u890.j(this.e, dvy0Var.e) && u890.j(this.f, dvy0Var.f) && u890.j(this.g, dvy0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iD = cy30.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        int iHashCode2 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.g;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }
}
