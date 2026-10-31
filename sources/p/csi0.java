package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class csi0 {
    public final oq70 a;
    public final Map b;

    public csi0(oq70 oq70Var, Map map) {
        this.a = oq70Var;
        this.b = ila0.G(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csi0)) {
            return false;
        }
        csi0 csi0Var = (csi0) obj;
        return u890.j(this.a, csi0Var.a) && u890.j(this.b, csi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ')';
    }
}
