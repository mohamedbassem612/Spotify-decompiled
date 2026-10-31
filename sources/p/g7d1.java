package p;

import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g7d1 {
    public static final g7d1 m = new g7d1("", z6x.a, d7d1.a, 0, null, null, null, null, 3584);
    public final String a;
    public final List b;
    public final f7d1 c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final Map l;

    public /* synthetic */ g7d1(String str, List list, f7d1 f7d1Var, int i, String str2, String str3, String str4, String str5, int i2) {
        this(str, list, f7d1Var, 0, i, str2, str3, str4, false, false, (i2 & SemanticState.ReadOnly) != 0 ? "" : str5, null);
    }

    public static g7d1 a(g7d1 g7d1Var, ArrayList arrayList, f7d1 f7d1Var, int i, boolean z, Map map, int i2) {
        String str = g7d1Var.a;
        List list = arrayList;
        if ((i2 & 2) != 0) {
            list = g7d1Var.b;
        }
        return new g7d1(str, list, (i2 & 4) != 0 ? g7d1Var.c : f7d1Var, (i2 & 8) != 0 ? g7d1Var.d : i, g7d1Var.e, g7d1Var.f, g7d1Var.g, g7d1Var.h, (i2 & SemanticState.Hidden) != 0 ? g7d1Var.i : true, (i2 & 512) != 0 ? g7d1Var.j : z, g7d1Var.k, (i2 & SemanticState.Modal) != 0 ? g7d1Var.l : map);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7d1)) {
            return false;
        }
        g7d1 g7d1Var = (g7d1) obj;
        if (!u890.j(this.a, g7d1Var.a) || !u890.j(this.b, g7d1Var.b) || !u890.j(this.c, g7d1Var.c) || this.d != g7d1Var.d || this.e != g7d1Var.e || !u890.j(this.f, g7d1Var.f)) {
            return false;
        }
        String str = g7d1Var.g;
        String str2 = this.g;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        if (!zEquals) {
            return false;
        }
        String str3 = g7d1Var.h;
        String str4 = this.h;
        if (str4 == null) {
            if (str3 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (str3 == null) {
            zEquals2 = false;
        } else {
            zEquals2 = str4.equals(str3);
        }
        return zEquals2 && this.i == g7d1Var.i && this.j == g7d1Var.j && u890.j(this.k, g7d1Var.k) && u890.j(this.l, g7d1Var.l);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31);
        String str = this.f;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iD = cy30.d(xcg1.g(xcg1.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
        Map map = this.l;
        return iD + (map != null ? map.hashCode() : 0);
    }

    public g7d1(String str, List list, f7d1 f7d1Var, int i, int i2, String str2, String str3, String str4, boolean z, boolean z2, String str5, Map map) {
        this.a = str;
        this.b = list;
        this.c = f7d1Var;
        this.d = i;
        this.e = i2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = z2;
        this.k = str5;
        this.l = map;
    }
}
