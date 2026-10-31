package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hy01 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;

    public hy01(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy01)) {
            return false;
        }
        hy01 hy01Var = (hy01) obj;
        return u890.j(this.a, hy01Var.a) && u890.j(this.b, hy01Var.b) && this.c == hy01Var.c && this.d == hy01Var.d && this.e == hy01Var.e && this.f == hy01Var.f && this.g == hy01Var.g && u890.j(this.h, hy01Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
