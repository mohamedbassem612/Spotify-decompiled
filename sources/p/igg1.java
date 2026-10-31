package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class igg1 {
    public final Integer a;
    public final ArrayList b;

    public igg1(Integer num, ArrayList arrayList) {
        this.a = num;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igg1)) {
            return false;
        }
        igg1 igg1Var = (igg1) obj;
        return u890.j(this.a, igg1Var.a) && this.b.equals(igg1Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
