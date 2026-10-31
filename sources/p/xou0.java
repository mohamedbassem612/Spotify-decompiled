package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xou0 implements ez00 {
    public final ArrayList a;
    public final ArrayList b;

    public xou0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xou0)) {
            return false;
        }
        xou0 xou0Var = (xou0) obj;
        return this.a.equals(xou0Var.a) && this.b.equals(xou0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
