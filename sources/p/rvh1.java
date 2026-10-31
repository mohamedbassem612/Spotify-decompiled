package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rvh1 {
    public final ArrayList a;
    public final int b;

    public rvh1(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvh1)) {
            return false;
        }
        rvh1 rvh1Var = (rvh1) obj;
        return this.a.equals(rvh1Var.a) && this.b == rvh1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
