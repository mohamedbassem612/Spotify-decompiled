package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iia1 {
    public final zha1 a;
    public final ArrayList b;

    public iia1(ArrayList arrayList, zha1 zha1Var) {
        this.a = zha1Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iia1)) {
            return false;
        }
        iia1 iia1Var = (iia1) obj;
        return this.a == iia1Var.a && this.b.equals(iia1Var.b);
    }

    public final int hashCode() {
        zha1 zha1Var = this.a;
        return this.b.hashCode() + ((zha1Var == null ? 0 : zha1Var.hashCode()) * 31);
    }
}
