package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xek {
    public final hvl1 a;
    public final List b;
    public final boolean c;
    public final String d;

    public xek(hvl1 hvl1Var, List list, boolean z, String str) {
        this.a = hvl1Var;
        this.b = list;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xek)) {
            return false;
        }
        xek xekVar = (xek) obj;
        return this.a.equals(xekVar.a) && this.b.equals(xekVar.b) && this.c == xekVar.c && u890.j(this.d, xekVar.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(f4i1.b((this.a.hashCode() - 1609848761) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
