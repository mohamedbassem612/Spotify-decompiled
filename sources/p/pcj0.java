package p;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pcj0 implements qcj0 {
    public final ArrayList a;
    public final LinkedHashSet b;

    public pcj0(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        this.a = arrayList;
        this.b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcj0)) {
            return false;
        }
        pcj0 pcj0Var = (pcj0) obj;
        return this.a.equals(pcj0Var.a) && this.b.equals(pcj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
