package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wms {
    public final ak3 a;
    public final List b;

    public wms(ak3 ak3Var, List list) {
        this.a = ak3Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wms)) {
            return false;
        }
        wms wmsVar = (wms) obj;
        return this.a == wmsVar.a && u890.j(this.b, wmsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
