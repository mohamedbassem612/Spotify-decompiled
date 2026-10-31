package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gwu implements hwu {
    public final Map a;
    public final Map b;

    public gwu(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwu)) {
            return false;
        }
        gwu gwuVar = (gwu) obj;
        return this.a.equals(gwuVar.a) && u890.j(this.b, gwuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
