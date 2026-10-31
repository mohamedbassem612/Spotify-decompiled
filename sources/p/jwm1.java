package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jwm1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final i4d0 e;
    public final List f;

    public jwm1(String str, boolean z, boolean z2, boolean z3, i4d0 i4d0Var, List list) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i4d0Var;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwm1)) {
            return false;
        }
        jwm1 jwm1Var = (jwm1) obj;
        return this.a.equals(jwm1Var.a) && this.b == jwm1Var.b && this.c == jwm1Var.c && this.d == jwm1Var.d && this.e.equals(jwm1Var.e) && this.f.equals(jwm1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }
}
