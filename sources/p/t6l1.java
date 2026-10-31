package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t6l1 {
    public final String a;
    public final hvl1 b;
    public final ArrayList c;

    public t6l1(String str, ArrayList arrayList, hvl1 hvl1Var) {
        this.a = str;
        this.b = hvl1Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6l1)) {
            return false;
        }
        t6l1 t6l1Var = (t6l1) obj;
        return this.a.equals(t6l1Var.a) && this.b.equals(t6l1Var.b) && this.c.equals(t6l1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
