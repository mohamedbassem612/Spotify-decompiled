package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fz9 extends u4p1 {
    public final ArrayList c;
    public final int d;

    public fz9(int i, ArrayList arrayList) {
        this.c = arrayList;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz9)) {
            return false;
        }
        fz9 fz9Var = (fz9) obj;
        return this.c.equals(fz9Var.c) && this.d == fz9Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
