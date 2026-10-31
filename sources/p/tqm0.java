package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tqm0 {
    public final List a;
    public final int b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public tqm0(List list, int i, String str, Integer num, Integer num2) {
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqm0)) {
            return false;
        }
        tqm0 tqm0Var = (tqm0) obj;
        return u890.j(this.a, tqm0Var.a) && this.b == tqm0Var.b && u890.j(this.c, tqm0Var.c) && u890.j(this.d, tqm0Var.d) && u890.j(this.e, tqm0Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public /* synthetic */ tqm0(List list) {
        this(list, 1, null, null, null);
    }
}
