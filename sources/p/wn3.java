package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wn3 extends qxd0 {
    public final Map d;
    public final boolean e;

    public wn3(Map map, boolean z) {
        this.d = map;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn3)) {
            return false;
        }
        wn3 wn3Var = (wn3) obj;
        return u890.j(this.d, wn3Var.d) && this.e == wn3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
