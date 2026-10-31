package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class erg0 extends ozn1 {
    public final ArrayList c;
    public final ArrayList d;

    public erg0(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erg0)) {
            return false;
        }
        erg0 erg0Var = (erg0) obj;
        return this.c.equals(erg0Var.c) && this.d.equals(erg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
