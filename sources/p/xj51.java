package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xj51 {
    public final ArrayList a;
    public final String b;

    public xj51(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj51)) {
            return false;
        }
        xj51 xj51Var = (xj51) obj;
        return this.a.equals(xj51Var.a) && this.b.equals(xj51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
