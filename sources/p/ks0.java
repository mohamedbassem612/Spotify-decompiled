package p;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@o661
public final class ks0 {
    public static final ds0 Companion = new ds0();
    public static final znb0[] n = {null, null, dm5.S(2, p4.Z), dm5.S(2, p4.N0), dm5.S(2, p4.O0), dm5.S(2, p4.P0)};
    public final String a;
    public final String b;
    public final Map c;
    public final Map d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ ks0(int i, String str, String str2, Map map, Map map2, List list, List list2) throws MissingFieldException {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, cs0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        int i2 = i & 4;
        Map map3 = b7x.a;
        if (i2 == 0) {
            this.c = map3;
        } else {
            this.c = map;
        }
        if ((i & 8) == 0) {
            this.d = map3;
            map2 = map3;
        } else {
            this.d = map2;
        }
        int i3 = i & 16;
        z6x z6xVar = z6x.a;
        if (i3 == 0) {
            this.e = z6xVar;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = z6xVar;
        } else {
            this.f = list2;
        }
        String str3 = (String) map2.get("advertiser");
        this.g = str3 == null ? "" : str3;
        String str4 = (String) map2.get("creative_id");
        this.h = str4 == null ? "" : str4;
        String str5 = (String) map2.get("buttonMessage");
        this.i = str5 == null ? "" : str5;
        String str6 = (String) map2.get("lineitem_id");
        this.j = str6 == null ? "" : str6;
        String str7 = (String) map2.get("logoImage");
        this.k = str7 == null ? "" : str7;
        String str8 = (String) map2.get("product_name");
        this.l = str8 == null ? "" : str8;
        String str9 = (String) map2.get("tagline");
        this.m = str9 != null ? str9 : "";
    }

    public final String a() {
        return this.g;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.i;
    }

    public final List e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks0)) {
            return false;
        }
        ks0 ks0Var = (ks0) obj;
        return u890.j(this.a, ks0Var.a) && u890.j(this.b, ks0Var.b) && u890.j(this.c, ks0Var.c) && u890.j(this.d, ks0Var.d) && u890.j(this.e, ks0Var.e) && u890.j(this.f, ks0Var.f);
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.j;
    }

    public final String h() {
        return this.k;
    }

    public final int hashCode() {
        return this.f.hashCode() + f4i1.b(cy30.e(cy30.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String i() {
        return this.l;
    }

    public final String j() {
        return this.m;
    }

    public final Map k() {
        return this.c;
    }

    public final List l() {
        return this.e;
    }
}
