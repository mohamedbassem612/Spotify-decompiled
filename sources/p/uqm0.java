package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uqm0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final int g;

    public uqm0(int i, String str, String str2, String str3, String str4, String str5, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = str5;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqm0)) {
            return false;
        }
        uqm0 uqm0Var = (uqm0) obj;
        return this.a.equals(uqm0Var.a) && this.b.equals(uqm0Var.b) && this.c.equals(uqm0Var.c) && u890.j(this.d, uqm0Var.d) && u890.j(this.e, uqm0Var.e) && u890.j(this.f, uqm0Var.f) && this.g == uqm0Var.g;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return l1d.C(this.g) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
