package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q1k0 {
    public final ArrayList a;
    public final Integer b;

    public q1k0(Integer num, ArrayList arrayList) {
        this.a = arrayList;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1k0)) {
            return false;
        }
        q1k0 q1k0Var = (q1k0) obj;
        return this.a.equals(q1k0Var.a) && u890.j(this.b, q1k0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
