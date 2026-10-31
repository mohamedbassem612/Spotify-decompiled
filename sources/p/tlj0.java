package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tlj0 {
    public final iu30 a;
    public final Map b;

    public tlj0(Map map, iu30 iu30Var) {
        this.a = iu30Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlj0)) {
            return false;
        }
        tlj0 tlj0Var = (tlj0) obj;
        return this.a.equals(tlj0Var.a) && this.b.equals(tlj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
