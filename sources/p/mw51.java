package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mw51 {
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public mw51(String str, List list, List list2, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw51)) {
            return false;
        }
        mw51 mw51Var = (mw51) obj;
        return u890.j(this.a, mw51Var.a) && u890.j(this.b, mw51Var.b) && u890.j(this.c, mw51Var.c) && this.d == mw51Var.d && this.e == mw51Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
