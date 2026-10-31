package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ypk {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final List e;
    public final List f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public ypk(boolean z, boolean z2, String str, List list, smc0 smc0Var, int i) {
        boolean z3 = (i & 2) == 0;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        str = (i & 32) != 0 ? null : str;
        int i2 = i & 64;
        List list2 = z6x.a;
        list = i2 != 0 ? list2 : list;
        ?? r8 = (i & 128) != 0 ? list2 : smc0Var;
        this.a = z3;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = list;
        this.f = r8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypk)) {
            return false;
        }
        ypk ypkVar = (ypk) obj;
        return this.a == ypkVar.a && this.b == ypkVar.b && this.c == ypkVar.c && u890.j(this.d, ypkVar.d) && this.e.equals(ypkVar.e) && this.f.equals(ypkVar.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(true) * 31, 31, this.a), 31, true), 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + f4i1.b((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }
}
