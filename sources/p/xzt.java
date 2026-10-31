package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class xzt {
    public static final wzt Companion = new wzt();
    public static final znb0[] h = {dm5.S(2, u6t.O0), null, null, null, null, null, dm5.S(2, u6t.P0)};
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final zkg f;
    public final List g;

    public /* synthetic */ xzt(int i, List list, String str, String str2, String str3, String str4, zkg zkgVar, List list2) {
        if (2 != (i & 2)) {
            o6p1.t(i, 2, vzt.a.getDescriptor());
            throw null;
        }
        int i2 = i & 1;
        z6x z6xVar = z6x.a;
        if (i2 == 0) {
            this.a = z6xVar;
        } else {
            this.a = list;
        }
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "MOBILE_CLIENT";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = zkgVar;
        }
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
        if (!(obj instanceof xzt)) {
            return false;
        }
        xzt xztVar = (xzt) obj;
        return u890.j(this.a, xztVar.a) && u890.j(this.b, xztVar.b) && u890.j(this.c, xztVar.c) && u890.j(this.d, xztVar.d) && u890.j(this.e, xztVar.e) && u890.j(this.f, xztVar.f) && u890.j(this.g, xztVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iD2 = cy30.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        zkg zkgVar = this.f;
        return this.g.hashCode() + ((iD2 + (zkgVar != null ? zkgVar.hashCode() : 0)) * 31);
    }

    public xzt(List list, String str, String str2, String str3, zkg zkgVar, List list2) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = "MOBILE_CLIENT";
        this.f = zkgVar;
        this.g = list2;
    }
}
