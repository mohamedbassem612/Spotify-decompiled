package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pw2 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final vu30 e;

    public pw2(int i, String str, String str2, String str3, ArrayList arrayList) {
        this(str, str2, (i & 4) != 0 ? null : str3, (List) arrayList, (vu30) new ow2(2, (lnm) null, (byte) 0));
    }

    public final vu30 a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw2)) {
            return false;
        }
        pw2 pw2Var = (pw2) obj;
        return u890.j(this.a, pw2Var.a) && u890.j(this.b, pw2Var.b) && u890.j(this.c, pw2Var.c) && u890.j(this.d, pw2Var.d) && u890.j(this.e, pw2Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + f4i1.b((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    public pw2(String str, String str2, String str3, List list, vu30 vu30Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = vu30Var;
    }
}
