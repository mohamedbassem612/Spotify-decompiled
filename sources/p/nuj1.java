package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nuj1 {
    public final String a;
    public final String b;
    public final List c;
    public final int d = 2;
    public final String e = "";

    public nuj1(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuj1)) {
            return false;
        }
        nuj1 nuj1Var = (nuj1) obj;
        return this.a.equals(nuj1Var.a) && this.b.equals(nuj1Var.b) && this.c.equals(nuj1Var.c) && this.d == nuj1Var.d && this.e.equals(nuj1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
