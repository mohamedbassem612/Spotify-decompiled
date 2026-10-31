package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d8e0 {
    public final List a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public d8e0(int i, String str, List list, boolean z, boolean z2) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8e0)) {
            return false;
        }
        d8e0 d8e0Var = (d8e0) obj;
        return this.a.equals(d8e0Var.a) && this.b == d8e0Var.b && this.c == d8e0Var.c && this.d == d8e0Var.d && u890.j(this.e, d8e0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
