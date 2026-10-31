package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tf3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final String g;
    public final q8b h;
    public final d8r0 i;
    public final boolean j;
    public final int k;
    public final List l;
    public final String m;

    public tf3(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, q8b q8bVar, d8r0 d8r0Var, boolean z, int i, List list, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = str6;
        this.h = q8bVar;
        this.i = d8r0Var;
        this.j = z;
        this.k = i;
        this.l = list;
        this.m = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf3)) {
            return false;
        }
        tf3 tf3Var = (tf3) obj;
        return u890.j(this.a, tf3Var.a) && u890.j(this.b, tf3Var.b) && u890.j(this.c, tf3Var.c) && u890.j(this.d, tf3Var.d) && u890.j(this.e, tf3Var.e) && this.f.equals(tf3Var.f) && u890.j(this.g, tf3Var.g) && this.h.equals(tf3Var.h) && this.i.equals(tf3Var.i) && this.j == tf3Var.j && this.k == tf3Var.k && this.l.equals(tf3Var.l) && u890.j(this.m, tf3Var.m);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.m.hashCode() + f4i1.b(ab80.k(this.k, xcg1.g(hrt.i(this.i, (this.h.hashCode() + cy30.d(p3d1.f(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g)) * 31, 31), 31, this.j), 31), 31, this.l);
    }
}
