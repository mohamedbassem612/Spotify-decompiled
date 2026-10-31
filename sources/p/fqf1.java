package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fqf1 extends jqf1 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final dqf1 e;

    public fqf1(String str, String str2, List list, String str3, dqf1 dqf1Var) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = dqf1Var;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqf1)) {
            return false;
        }
        fqf1 fqf1Var = (fqf1) obj;
        return this.a.equals(fqf1Var.a) && this.b.equals(fqf1Var.b) && this.c.equals(fqf1Var.c) && this.d.equals(fqf1Var.d) && this.e.equals(fqf1Var.e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.e.hashCode() + cy30.d(f4i1.b(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, false), 31, this.c), 31, this.d)) * 31);
    }
}
