package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lkh1 implements nkh1 {
    public final String a;
    public final String b;
    public final List c;

    public lkh1(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkh1)) {
            return false;
        }
        lkh1 lkh1Var = (lkh1) obj;
        return this.a.equals(lkh1Var.a) && this.b.equals(lkh1Var.b) && this.c.equals(lkh1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
