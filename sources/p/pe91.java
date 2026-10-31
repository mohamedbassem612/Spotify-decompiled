package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pe91 {
    public final ArrayList a;
    public final x4e0 b;

    public pe91(ArrayList arrayList, x4e0 x4e0Var) {
        this.a = arrayList;
        this.b = x4e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe91)) {
            return false;
        }
        pe91 pe91Var = (pe91) obj;
        return this.a.equals(pe91Var.a) && this.b == pe91Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
