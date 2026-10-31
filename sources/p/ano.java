package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ano {
    public final zkt0 a;
    public final String b;
    public final String c;
    public final String d;
    public final s27 e;
    public final k4m f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final List l;
    public final aak0 m;

    public ano(zkt0 zkt0Var, String str, String str2, String str3, s27 s27Var, k4m k4mVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, aak0 aak0Var) {
        this.a = zkt0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = s27Var;
        this.f = k4mVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = list;
        this.m = aak0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ano)) {
            return false;
        }
        ano anoVar = (ano) obj;
        return this.a == anoVar.a && this.b.equals(anoVar.b) && this.c.equals(anoVar.c) && this.d.equals(anoVar.d) && this.e.equals(anoVar.e) && this.f == anoVar.f && this.g == anoVar.g && this.h == anoVar.h && this.i == anoVar.i && this.j == anoVar.j && this.k == anoVar.k && u890.j(this.l, anoVar.l) && u890.j(this.m, anoVar.m);
    }

    public final int hashCode() {
        int iB = f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(p3d1.g(this.f, (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        aak0 aak0Var = this.m;
        return iB + (aak0Var == null ? 0 : aak0Var.hashCode());
    }
}
