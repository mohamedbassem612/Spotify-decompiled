package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rhz0 {
    public final String a;
    public final String b;
    public final vu30 c;
    public final vu30 d;
    public final vu30 e;
    public final List f;
    public final String g;
    public final boolean h;
    public final rx7 i;
    public final rx7 j;

    public rhz0(String str, String str2, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, List list, String str3, boolean z, rx7 rx7Var, rx7 rx7Var2) {
        this.a = str;
        this.b = str2;
        this.c = vu30Var;
        this.d = vu30Var2;
        this.e = vu30Var3;
        this.f = list;
        this.g = str3;
        this.h = z;
        this.i = rx7Var;
        this.j = rx7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhz0)) {
            return false;
        }
        rhz0 rhz0Var = (rhz0) obj;
        return u890.j(this.a, rhz0Var.a) && u890.j(this.b, rhz0Var.b) && this.c.equals(rhz0Var.c) && this.d.equals(rhz0Var.d) && this.e.equals(rhz0Var.e) && u890.j(this.f, rhz0Var.f) && u890.j(this.g, rhz0Var.g) && this.h == rhz0Var.h && this.i.equals(rhz0Var.i) && this.j.equals(rhz0Var.j);
    }

    public final int hashCode() {
        int iB = f4i1.b(hrt.g(hrt.g(hrt.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return this.j.hashCode() + ((this.i.hashCode() + xcg1.g((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.h)) * 31);
    }
}
