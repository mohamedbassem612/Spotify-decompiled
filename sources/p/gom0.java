package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gom0 {
    public final List a;
    public final Map b;

    public gom0(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gom0)) {
            return false;
        }
        gom0 gom0Var = (gom0) obj;
        return this.a.equals(gom0Var.a) && u890.j(this.b, gom0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
