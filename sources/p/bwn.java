package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bwn {
    public final Map a;
    public final Map b;

    public bwn(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwn)) {
            return false;
        }
        bwn bwnVar = (bwn) obj;
        return u890.j(this.a, bwnVar.a) && u890.j(this.b, bwnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
