package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c3f1 {
    public final String a;
    public final upf b;
    public final String c;
    public final boolean d;
    public final String e;
    public final List f;
    public final boolean g;
    public final b3f1 h;
    public final String i;
    public final a3f1 j;

    public /* synthetic */ c3f1(String str, upf upfVar, String str2, boolean z, String str3, ArrayList arrayList, boolean z2, b3f1 b3f1Var, String str4, a3f1 a3f1Var, int i) {
        this(str, upfVar, str2, z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? z6x.a : arrayList, z2, (i & 128) != 0 ? b3f1.a : b3f1Var, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : a3f1Var);
    }

    public static c3f1 a(c3f1 c3f1Var, boolean z, List list, int i) {
        String str = c3f1Var.a;
        upf upfVar = c3f1Var.b;
        String str2 = c3f1Var.c;
        String str3 = c3f1Var.e;
        if ((i & 32) != 0) {
            list = c3f1Var.f;
        }
        return new c3f1(str, upfVar, str2, z, str3, list, c3f1Var.g, c3f1Var.h, c3f1Var.i, c3f1Var.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3f1)) {
            return false;
        }
        c3f1 c3f1Var = (c3f1) obj;
        return u890.j(this.a, c3f1Var.a) && u890.j(this.b, c3f1Var.b) && u890.j(this.c, c3f1Var.c) && this.d == c3f1Var.d && u890.j(this.e, c3f1Var.e) && u890.j(this.f, c3f1Var.f) && this.g == c3f1Var.g && this.h == c3f1Var.h && u890.j(this.i, c3f1Var.i) && u890.j(this.j, c3f1Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (this.h.hashCode() + xcg1.g(f4i1.b((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g)) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a3f1 a3f1Var = this.j;
        return iHashCode2 + (a3f1Var != null ? a3f1Var.hashCode() : 0);
    }

    public c3f1(String str, upf upfVar, String str2, boolean z, String str3, List list, boolean z2, b3f1 b3f1Var, String str4, a3f1 a3f1Var) {
        this.a = str;
        this.b = upfVar;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = list;
        this.g = z2;
        this.h = b3f1Var;
        this.i = str4;
        this.j = a3f1Var;
    }
}
