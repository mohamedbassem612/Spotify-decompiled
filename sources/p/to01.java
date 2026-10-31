package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class to01 {
    public final yo01 a;
    public final f281 b;
    public final xwp0 c;
    public final String d;
    public final int e;
    public final Map f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;

    public to01(yo01 yo01Var, f281 f281Var, xwp0 xwp0Var, String str, int i, Map map, String str2, String str3, boolean z, String str4) {
        this.a = yo01Var;
        this.b = f281Var;
        this.c = xwp0Var;
        this.d = str;
        this.e = i;
        this.f = map;
        this.g = str2;
        this.h = str3;
        this.i = z;
        this.j = str4;
    }

    public final boolean a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to01)) {
            return false;
        }
        to01 to01Var = (to01) obj;
        return this.a == to01Var.a && this.b == to01Var.b && this.c.equals(to01Var.c) && u890.j(this.d, to01Var.d) && this.e == to01Var.e && this.f.equals(to01Var.f) && u890.j(this.g, to01Var.g) && u890.j(this.h, to01Var.h) && this.i == to01Var.i && u890.j(this.j, to01Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.e(ab80.k(this.e, cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
