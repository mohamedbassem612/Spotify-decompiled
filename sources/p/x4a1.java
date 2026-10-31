package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x4a1 implements y4a1 {
    public final String a;
    public final wea0 b;
    public final Set c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public x4a1(String str, wea0 wea0Var, Set set, int i, String str2, String str3, String str4) {
        this.a = str;
        this.b = wea0Var;
        this.c = set;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final wea0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final Set c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4a1)) {
            return false;
        }
        x4a1 x4a1Var = (x4a1) obj;
        return u890.j(this.a, x4a1Var.a) && u890.j(this.b, x4a1Var.b) && this.c.equals(x4a1Var.c) && this.d == x4a1Var.d && this.e.equals(x4a1Var.e) && this.f.equals(x4a1Var.f) && this.g.equals(x4a1Var.g);
    }

    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(ab80.k(this.d, gvg.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e), 31, this.f);
    }
}
