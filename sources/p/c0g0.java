package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c0g0 {
    public final ArrayList a;
    public final ArrayList b;

    public c0g0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0g0)) {
            return false;
        }
        c0g0 c0g0Var = (c0g0) obj;
        return this.a.equals(c0g0Var.a) && this.b.equals(c0g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
