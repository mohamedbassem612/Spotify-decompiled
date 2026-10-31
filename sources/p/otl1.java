package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class otl1 {
    public final List a;
    public final Integer b;

    public otl1(Integer num, List list) {
        this.a = list;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otl1)) {
            return false;
        }
        otl1 otl1Var = (otl1) obj;
        return u890.j(this.a, otl1Var.a) && u890.j(this.b, otl1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public /* synthetic */ otl1() {
        this(null, z6x.a);
    }
}
