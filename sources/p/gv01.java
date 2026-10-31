package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gv01 {
    public final List a;
    public final int b;

    public gv01(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv01)) {
            return false;
        }
        gv01 gv01Var = (gv01) obj;
        return this.a.equals(gv01Var.a) && this.b == gv01Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
