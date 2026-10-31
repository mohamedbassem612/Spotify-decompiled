package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bqt {
    public final ypt a;
    public final List b;

    public bqt(ypt yptVar, List list) {
        this.a = yptVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqt)) {
            return false;
        }
        bqt bqtVar = (bqt) obj;
        return this.a.equals(bqtVar.a) && u890.j(this.b, bqtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
