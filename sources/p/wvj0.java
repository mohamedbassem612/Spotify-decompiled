package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wvj0 {
    public final vvj0 a;
    public final Map b;

    public wvj0(vvj0 vvj0Var, Map map) {
        this.a = vvj0Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvj0)) {
            return false;
        }
        wvj0 wvj0Var = (wvj0) obj;
        return this.a.equals(wvj0Var.a) && u890.j(this.b, wvj0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
