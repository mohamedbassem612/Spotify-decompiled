package p;

import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h52 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h52(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = (i & 1) != 0 ? "" : str;
        String str9 = (i & 2) != 0 ? "" : str2;
        String str10 = (i & 4) != 0 ? "" : str3;
        String str11 = (i & 8) != 0 ? "" : str4;
        String str12 = (i & 16) != 0 ? "" : str5;
        String str13 = (i & 32) != 0 ? "" : str6;
        String str14 = (i & 64) != 0 ? "" : str7;
        boolean z = (i & SemanticState.ReadOnly) == 0;
        z6x z6xVar = z6x.a;
        this(str8, str9, str10, str11, str12, str13, str14, "", z6xVar, z6xVar, z, false, false);
    }

    public static h52 a(h52 h52Var, String str, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, boolean z3, int i) {
        String str2 = h52Var.a;
        String str3 = h52Var.b;
        String str4 = h52Var.c;
        String str5 = h52Var.d;
        String str6 = h52Var.e;
        String str7 = h52Var.f;
        String str8 = h52Var.g;
        if ((i & SemanticState.Focused) != 0) {
            str = h52Var.h;
        }
        String str9 = str;
        List list = (i & SemanticState.Hidden) != 0 ? h52Var.i : arrayList;
        List list2 = (i & 512) != 0 ? h52Var.j : arrayList2;
        boolean z4 = (i & SemanticState.Modal) != 0 ? h52Var.l : z2;
        boolean z5 = (i & SemanticState.Obscured) != 0 ? h52Var.m : z3;
        h52Var.getClass();
        return new h52(str2, str3, str4, str5, str6, str7, str8, str9, list, list2, z, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h52)) {
            return false;
        }
        h52 h52Var = (h52) obj;
        return u890.j(this.a, h52Var.a) && u890.j(this.b, h52Var.b) && u890.j(this.c, h52Var.c) && u890.j(this.d, h52Var.d) && u890.j(this.e, h52Var.e) && u890.j(this.f, h52Var.f) && u890.j(this.g, h52Var.g) && u890.j(this.h, h52Var.h) && u890.j(this.i, h52Var.i) && u890.j(this.j, h52Var.j) && this.k == h52Var.k && this.l == h52Var.l && this.m == h52Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + xcg1.g(xcg1.g(f4i1.b(f4i1.b(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public h52(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = list;
        this.j = list2;
        this.k = z;
        this.l = z2;
        this.m = z3;
    }
}
