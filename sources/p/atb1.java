package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class atb1 implements btb1 {
    public final xsb1 a;
    public final String b;
    public final d761 c;
    public final List d;
    public final xxh e;
    public final String f;
    public final String g;
    public final d761 h;
    public final List i;
    public final String j;
    public final boolean k;
    public final boolean l;

    public /* synthetic */ atb1(xsb1 xsb1Var, String str, d761 d761Var, List list, xxh xxhVar, String str2, String str3, d761 d761Var2, ArrayList arrayList, String str4, boolean z, boolean z2, int i) {
        this(xsb1Var, str, d761Var, list, xxhVar, str2, str3, (i & 128) != 0 ? null : d761Var2, (i & 256) != 0 ? z6x.a : arrayList, str4, (i & 1024) != 0 ? false : z, z2);
    }

    public static atb1 a(atb1 atb1Var, List list, String str, int i) {
        xsb1 xsb1Var = atb1Var.a;
        String str2 = atb1Var.b;
        d761 d761Var = (i & 4) != 0 ? atb1Var.c : null;
        if ((i & 8) != 0) {
            list = atb1Var.d;
        }
        List list2 = list;
        xxh xxhVar = (i & 16) != 0 ? atb1Var.e : vxh.a;
        String str3 = atb1Var.g;
        List list3 = (i & 256) != 0 ? atb1Var.i : z6x.a;
        String str4 = atb1Var.j;
        boolean z = atb1Var.k;
        boolean z2 = atb1Var.l;
        atb1Var.getClass();
        return new atb1(xsb1Var, str2, d761Var, list2, xxhVar, str, str3, null, list3, str4, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atb1)) {
            return false;
        }
        atb1 atb1Var = (atb1) obj;
        return this.a == atb1Var.a && u890.j(this.b, atb1Var.b) && u890.j(this.c, atb1Var.c) && u890.j(this.d, atb1Var.d) && u890.j(this.e, atb1Var.e) && u890.j(this.f, atb1Var.f) && u890.j(this.g, atb1Var.g) && u890.j(this.h, atb1Var.h) && u890.j(this.i, atb1Var.i) && u890.j(this.j, atb1Var.j) && this.k == atb1Var.k && this.l == atb1Var.l;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        d761 d761Var = this.c;
        int iD2 = cy30.d(cy30.d((this.e.hashCode() + f4i1.b((iD + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g);
        d761 d761Var2 = this.h;
        return Boolean.hashCode(this.l) + xcg1.g(cy30.d(f4i1.b((iD2 + (d761Var2 != null ? Arrays.hashCode(d761Var2.a) : 0)) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public atb1(xsb1 xsb1Var, String str, d761 d761Var, List list, xxh xxhVar, String str2, String str3, d761 d761Var2, List list2, String str4, boolean z, boolean z2) {
        this.a = xsb1Var;
        this.b = str;
        this.c = d761Var;
        this.d = list;
        this.e = xxhVar;
        this.f = str2;
        this.g = str3;
        this.h = d761Var2;
        this.i = list2;
        this.j = str4;
        this.k = z;
        this.l = z2;
    }
}
