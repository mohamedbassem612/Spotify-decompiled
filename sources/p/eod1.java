package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eod1 {
    public final List a;
    public final dzo1 b;
    public final Integer c;

    public eod1(List list, dzo1 dzo1Var, Integer num) {
        this.a = list;
        this.b = dzo1Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eod1)) {
            return false;
        }
        eod1 eod1Var = (eod1) obj;
        return this.a.equals(eod1Var.a) && u890.j(this.b, eod1Var.b) && u890.j(this.c, eod1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
