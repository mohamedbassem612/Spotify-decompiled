package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rvb1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final hxb1 f;
    public final List g;

    public rvb1(String str, String str2, String str3, String str4, List list, hxb1 hxb1Var, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = hxb1Var;
        this.g = list2;
    }

    public static rvb1 a(rvb1 rvb1Var, fxb1 fxb1Var) {
        String str = rvb1Var.a;
        String str2 = rvb1Var.b;
        String str3 = rvb1Var.c;
        String str4 = rvb1Var.d;
        List list = rvb1Var.e;
        List list2 = rvb1Var.g;
        rvb1Var.getClass();
        return new rvb1(str, str2, str3, str4, list, fxb1Var, list2);
    }

    public final hxb1 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvb1)) {
            return false;
        }
        rvb1 rvb1Var = (rvb1) obj;
        return this.a.equals(rvb1Var.a) && this.b.equals(rvb1Var.b) && this.c.equals(rvb1Var.c) && u890.j(this.d, rvb1Var.d) && this.e.equals(rvb1Var.e) && this.f.equals(rvb1Var.f) && this.g.equals(rvb1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + f4i1.b(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }
}
