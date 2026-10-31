package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d7u0 implements ez00 {
    public final ArrayList a;
    public final ArrayList b;

    public d7u0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7u0)) {
            return false;
        }
        d7u0 d7u0Var = (d7u0) obj;
        return this.a.equals(d7u0Var.a) && this.b.equals(d7u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
