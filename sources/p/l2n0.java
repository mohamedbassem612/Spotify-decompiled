package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l2n0 {
    public final ArrayList a;
    public final String b;

    public l2n0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2n0)) {
            return false;
        }
        l2n0 l2n0Var = (l2n0) obj;
        return this.a.equals(l2n0Var.a) && this.b.equals(l2n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
