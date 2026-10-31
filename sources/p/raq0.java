package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class raq0 {
    public final Set a;
    public final Integer b;
    public final Integer c;

    public raq0(Set set, Integer num, Integer num2) {
        this.a = set;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raq0)) {
            return false;
        }
        raq0 raq0Var = (raq0) obj;
        return this.a.equals(raq0Var.a) && u890.j(this.b, raq0Var.b) && u890.j(this.c, raq0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
