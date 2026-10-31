package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bve1 extends si1 {
    public final int e;
    public final ArrayList f;

    public bve1(int i, ArrayList arrayList) {
        this.e = i;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bve1)) {
            return false;
        }
        bve1 bve1Var = (bve1) obj;
        return this.e == bve1Var.e && this.f.equals(bve1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (Integer.hashCode(this.e) * 31);
    }

    @Override // p.si1
    public final int o() {
        return this.e;
    }
}
