package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y131 extends k331 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ksk e;
    public final String f;
    public final Map g;
    public final c8c0 h;
    public final Map i;

    public y131(String str, String str2, String str3, String str4, ksk kskVar, String str5, Map map, c8c0 c8c0Var, Map map2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = kskVar;
        this.f = str5;
        this.g = map;
        this.h = c8c0Var;
        this.i = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y131)) {
            return false;
        }
        y131 y131Var = (y131) obj;
        return u890.j(this.a, y131Var.a) && u890.j(this.b, y131Var.b) && this.c.equals(y131Var.c) && u890.j(this.d, y131Var.d) && this.e.equals(y131Var.e) && this.f.equals(y131Var.f) && u890.j(this.g, y131Var.g) && this.h == y131Var.h && u890.j(this.i, y131Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + cy30.e(cy30.d((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g)) * 31);
    }
}
