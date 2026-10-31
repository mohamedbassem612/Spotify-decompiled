package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class goc0 {
    public final List a;
    public final ArrayList b;

    public goc0(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goc0)) {
            return false;
        }
        goc0 goc0Var = (goc0) obj;
        return this.a.equals(goc0Var.a) && this.b.equals(goc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
