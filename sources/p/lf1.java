package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lf1 {
    public final qw50 a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public /* synthetic */ lf1() {
        this(new qw50("", "#FFFFFF", "", "#FFFFFF", "", "", new o10("", "", "primary"), "", ""), z6x.a, "", "", "", "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf1)) {
            return false;
        }
        lf1 lf1Var = (lf1) obj;
        return u890.j(this.a, lf1Var.a) && u890.j(this.b, lf1Var.b) && u890.j(this.c, lf1Var.c) && u890.j(this.d, lf1Var.d) && u890.j(this.e, lf1Var.e) && u890.j(this.f, lf1Var.f) && this.g == lf1Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + cy30.d(cy30.d(cy30.d(cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public lf1(qw50 qw50Var, List list, String str, String str2, String str3, String str4, boolean z) {
        this.a = qw50Var;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }
}
