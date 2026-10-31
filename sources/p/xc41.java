package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xc41 implements yc41 {
    public final Map a;
    public final boolean b;

    public xc41(Map map, boolean z) {
        this.a = map;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc41)) {
            return false;
        }
        xc41 xc41Var = (xc41) obj;
        return this.a.equals(xc41Var.a) && this.b == xc41Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
