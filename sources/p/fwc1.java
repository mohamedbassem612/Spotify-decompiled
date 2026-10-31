package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fwc1 {
    public final String a;
    public final ArrayList b;

    public fwc1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwc1)) {
            return false;
        }
        fwc1 fwc1Var = (fwc1) obj;
        return this.a.equals(fwc1Var.a) && this.b.equals(fwc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
