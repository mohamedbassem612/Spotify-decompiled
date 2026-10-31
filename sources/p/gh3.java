package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gh3 implements ez00 {
    public final String a;
    public final String b;
    public final den c;
    public final ArrayList d;
    public final String e;
    public final f5r f;
    public final ArrayList g;
    public final boolean h;
    public final ArrayList i;
    public final Long j;

    public gh3(String str, String str2, den denVar, ArrayList arrayList, String str3, f5r f5rVar, ArrayList arrayList2, boolean z, ArrayList arrayList3, Long l) {
        this.a = str;
        this.b = str2;
        this.c = denVar;
        this.d = arrayList;
        this.e = str3;
        this.f = f5rVar;
        this.g = arrayList2;
        this.h = z;
        this.i = arrayList3;
        this.j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh3)) {
            return false;
        }
        gh3 gh3Var = (gh3) obj;
        return this.a.equals(gh3Var.a) && this.b.equals(gh3Var.b) && this.c.equals(gh3Var.c) && this.d.equals(gh3Var.d) && u890.j(this.e, gh3Var.e) && this.f.equals(gh3Var.f) && this.g.equals(gh3Var.g) && this.h == gh3Var.h && this.i.equals(gh3Var.i) && u890.j(this.j, gh3Var.j);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.i, xcg1.g(p3d1.f(this.g, (this.f.hashCode() + cy30.d(p3d1.f(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e)) * 31, 31), 31, this.h), 31);
        Long l = this.j;
        return iF + (l == null ? 0 : l.hashCode());
    }
}
