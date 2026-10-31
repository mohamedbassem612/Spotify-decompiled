package p;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vri1 extends hxo1 {
    public final ArrayList c;
    public final LinkedHashSet d;

    public vri1(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        this.c = arrayList;
        this.d = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vri1)) {
            return false;
        }
        vri1 vri1Var = (vri1) obj;
        return this.c.equals(vri1Var.c) && this.d.equals(vri1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
