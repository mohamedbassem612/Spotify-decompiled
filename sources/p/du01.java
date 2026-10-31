package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class du01 extends gu01 {
    public final x360 a;
    public final List b;
    public final boolean c;
    public final String d;
    public final boolean e;

    public du01(x360 x360Var, List list, boolean z, String str, boolean z2) {
        this.a = x360Var;
        this.b = list;
        this.c = z;
        this.d = str;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du01)) {
            return false;
        }
        du01 du01Var = (du01) obj;
        return u890.j(this.a, du01Var.a) && u890.j(this.b, du01Var.b) && this.c == du01Var.c && this.d.equals(du01Var.d) && this.e == du01Var.e;
    }

    public final int hashCode() {
        x360 x360Var = this.a;
        return Boolean.hashCode(this.e) + cy30.d(xcg1.g(f4i1.b((x360Var == null ? 0 : x360Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
