package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class snk0 {
    public final ArrayList a;
    public final Integer b;

    public snk0(Integer num, ArrayList arrayList) {
        this.a = arrayList;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snk0)) {
            return false;
        }
        snk0 snk0Var = (snk0) obj;
        return this.a.equals(snk0Var.a) && u890.j(this.b, snk0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
