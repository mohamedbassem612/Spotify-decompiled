package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ma1 extends wa1 {
    public final List a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public ma1(List list, boolean z, String str, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma1)) {
            return false;
        }
        ma1 ma1Var = (ma1) obj;
        return u890.j(this.a, ma1Var.a) && this.b == ma1Var.b && u890.j(this.c, ma1Var.c) && this.d == ma1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
