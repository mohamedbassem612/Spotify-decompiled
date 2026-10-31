package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kuh1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Map f;

    public kuh1(String str, boolean z, boolean z2, boolean z3, boolean z4, Map map) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuh1)) {
            return false;
        }
        kuh1 kuh1Var = (kuh1) obj;
        return this.a.equals(kuh1Var.a) && this.b == kuh1Var.b && this.c == kuh1Var.c && this.d == kuh1Var.d && this.e == kuh1Var.e && u890.j(this.f, kuh1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
