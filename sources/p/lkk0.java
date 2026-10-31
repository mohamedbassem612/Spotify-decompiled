package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lkk0 {
    public final Map a;
    public final uao0 b;

    public lkk0(Map map, uao0 uao0Var) {
        this.a = map;
        this.b = uao0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkk0)) {
            return false;
        }
        lkk0 lkk0Var = (lkk0) obj;
        return this.a.equals(lkk0Var.a) && this.b == lkk0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
