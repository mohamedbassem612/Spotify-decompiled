package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aw51 {
    public final ArrayList a;
    public final ArrayList b;

    public aw51(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw51)) {
            return false;
        }
        aw51 aw51Var = (aw51) obj;
        return this.a.equals(aw51Var.a) && this.b.equals(aw51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
