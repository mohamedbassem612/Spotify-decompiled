package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wb40 {
    public final String a;
    public final int b;
    public final List c;
    public final Map d;
    public final boolean e;
    public final String f;

    public wb40(String str, int i, List list, Map map, boolean z, String str2) {
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = map;
        this.e = z;
        this.f = str2;
    }

    public static wb40 a(wb40 wb40Var, xkg0 xkg0Var, int i) {
        String str = wb40Var.a;
        int i2 = wb40Var.b;
        List list = wb40Var.c;
        if ((i & 8) != 0) {
            xkg0Var = wb40Var.d;
        }
        return new wb40(str, i2, list, xkg0Var, (i & 16) != 0 ? wb40Var.e : true, wb40Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb40)) {
            return false;
        }
        wb40 wb40Var = (wb40) obj;
        return this.a.equals(wb40Var.a) && this.b == wb40Var.b && this.c.equals(wb40Var.c) && u890.j(this.d, wb40Var.d) && this.e == wb40Var.e && this.f.equals(wb40Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(cy30.e(f4i1.b(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }
}
