package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cyo0 implements eyo0 {
    public final List a;
    public final String b;
    public final List c;

    public cyo0(String str, List list, List list2) {
        this.a = list;
        this.b = str;
        this.c = list2;
    }

    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyo0)) {
            return false;
        }
        cyo0 cyo0Var = (cyo0) obj;
        return this.a.equals(cyo0Var.a) && this.b.equals(cyo0Var.b) && this.c.equals(cyo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
