package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class sst0 implements iaa {
    public static final rst0 Companion = new rst0();
    public static final znb0[] l = {null, null, null, null, null, null, null, dm5.S(2, tnt0.c), null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final String f;
    public final Long g;
    public final Map h;
    public final hnc0 i;
    public final String j;
    public final Boolean k;

    public /* synthetic */ sst0(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, Long l2, Map map, hnc0 hnc0Var, String str6, Boolean bool2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, qst0.a.getDescriptor());
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
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = map;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = hnc0Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool2;
        }
    }

    public final String a(nfa0 nfa0Var) {
        return nfa0Var.b(Companion.serializer(), this);
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.j;
    }

    public final String d() {
        return this.e;
    }

    public final Long e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sst0)) {
            return false;
        }
        sst0 sst0Var = (sst0) obj;
        return u890.j(this.a, sst0Var.a) && u890.j(this.b, sst0Var.b) && u890.j(this.c, sst0Var.c) && u890.j(this.d, sst0Var.d) && u890.j(this.e, sst0Var.e) && u890.j(this.f, sst0Var.f) && u890.j(this.g, sst0Var.g) && u890.j(this.h, sst0Var.h) && u890.j(this.i, sst0Var.i) && u890.j(this.j, sst0Var.j) && u890.j(this.k, sst0Var.k);
    }

    public final Boolean f() {
        return this.d;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map map = this.h;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        hnc0 hnc0Var = this.i;
        int iHashCode9 = (iHashCode8 + (hnc0Var == null ? 0 : hnc0Var.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.k;
        return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean i() {
        return this.k;
    }
}
