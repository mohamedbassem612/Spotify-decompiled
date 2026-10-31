package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a101 {
    public final String a;
    public final int b;
    public final List c;
    public final boolean d;
    public final iu30 e;

    public a101(String str, int i, List list, boolean z, iu30 iu30Var) {
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = z;
        this.e = iu30Var;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a101)) {
            return false;
        }
        a101 a101Var = (a101) obj;
        return u890.j(this.a, a101Var.a) && this.b == a101Var.b && u890.j(this.c, a101Var.c) && this.d == a101Var.d && u890.j(this.e, a101Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(f4i1.b(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
