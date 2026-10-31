package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eqf1 extends iqf1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;
    public final String e;
    public final cqf1 f;
    public final String g;
    public final boolean h;

    public eqf1(String str, String str2, boolean z, List list, String str3, cqf1 cqf1Var, String str4, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
        this.e = str3;
        this.f = cqf1Var;
        this.g = str4;
        this.h = z2;
    }

    public static eqf1 b(eqf1 eqf1Var, boolean z, cqf1 cqf1Var, int i) {
        String str = eqf1Var.a;
        String str2 = eqf1Var.b;
        if ((i & 4) != 0) {
            z = eqf1Var.c;
        }
        boolean z2 = z;
        List list = eqf1Var.d;
        String str3 = eqf1Var.e;
        if ((i & 32) != 0) {
            cqf1Var = eqf1Var.f;
        }
        return new eqf1(str, str2, z2, list, str3, cqf1Var, eqf1Var.g, eqf1Var.h);
    }

    @Override // p.iqf1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqf1)) {
            return false;
        }
        eqf1 eqf1Var = (eqf1) obj;
        return this.a.equals(eqf1Var.a) && this.b.equals(eqf1Var.b) && this.c == eqf1Var.c && this.d.equals(eqf1Var.d) && this.e.equals(eqf1Var.e) && this.f.equals(eqf1Var.f) && u890.j(this.g, eqf1Var.g) && this.h == eqf1Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + cy30.d(f4i1.b(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        String str = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
