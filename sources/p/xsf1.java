package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xsf1 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public xsf1(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsf1)) {
            return false;
        }
        xsf1 xsf1Var = (xsf1) obj;
        return u890.j(this.a, xsf1Var.a) && this.b.equals(xsf1Var.b) && this.c.equals(xsf1Var.c) && u890.j(this.d, xsf1Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
