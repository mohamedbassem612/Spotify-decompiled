package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bfk {
    public final hvl1 a;
    public final int b;
    public final List c;
    public final boolean d;
    public final String e;

    public bfk(hvl1 hvl1Var, int i, List list, boolean z, String str) {
        this.a = hvl1Var;
        this.b = i;
        this.c = list;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfk)) {
            return false;
        }
        bfk bfkVar = (bfk) obj;
        return this.a.equals(bfkVar.a) && this.b == bfkVar.b && this.c.equals(bfkVar.c) && this.d == bfkVar.d && u890.j(this.e, bfkVar.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(f4i1.b(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
