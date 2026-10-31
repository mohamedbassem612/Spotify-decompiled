package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bw01 {
    public final ArrayList a;
    public final m9m b;

    public bw01(ArrayList arrayList, m9m m9mVar) {
        this.a = arrayList;
        this.b = m9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw01)) {
            return false;
        }
        bw01 bw01Var = (bw01) obj;
        return this.a.equals(bw01Var.a) && this.b == bw01Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m9m m9mVar = this.b;
        return iHashCode + (m9mVar == null ? 0 : m9mVar.hashCode());
    }
}
