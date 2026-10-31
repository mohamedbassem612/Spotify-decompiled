package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qq3 extends hr3 {
    public final Map a;
    public final boolean b;

    public qq3(Map map, boolean z) {
        this.a = map;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq3)) {
            return false;
        }
        qq3 qq3Var = (qq3) obj;
        return u890.j(this.a, qq3Var.a) && this.b == qq3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
