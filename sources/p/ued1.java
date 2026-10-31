package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ued1 {
    public final String a;
    public final ArrayList b;

    public ued1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ued1)) {
            return false;
        }
        ued1 ued1Var = (ued1) obj;
        return this.a.equals(ued1Var.a) && this.b.equals(ued1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
