package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class afr0 implements qfr0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final tfr0 g;

    public afr0(String str, String str2, String str3, String str4, String str5, List list, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afr0)) {
            return false;
        }
        afr0 afr0Var = (afr0) obj;
        return this.a.equals(afr0Var.a) && u890.j(this.b, afr0Var.b) && this.c.equals(afr0Var.c) && u890.j(this.d, afr0Var.d) && u890.j(this.e, afr0Var.e) && this.f.equals(afr0Var.f) && this.g.equals(afr0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.g.hashCode() + f4i1.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f);
    }
}
