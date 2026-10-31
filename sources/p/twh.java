package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class twh {
    public final swh a;
    public final List b;

    public twh(swh swhVar, List list) {
        this.a = swhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twh)) {
            return false;
        }
        twh twhVar = (twh) obj;
        return this.a.equals(twhVar.a) && u890.j(this.b, twhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
