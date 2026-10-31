package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v4k {
    public final twr a;
    public final b3k b;
    public final Map c;

    public v4k(twr twrVar, b3k b3kVar, Map map) {
        this.a = twrVar;
        this.b = b3kVar;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v4k) {
            v4k v4kVar = (v4k) obj;
            if (this.a == v4kVar.a && this.b == v4kVar.b && u890.j(this.c, v4kVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
