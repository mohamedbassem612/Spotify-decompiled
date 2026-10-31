package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d8b {
    public final Map a;
    public final boolean b;

    public d8b(Map map, boolean z) {
        this.a = map;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8b)) {
            return false;
        }
        d8b d8bVar = (d8b) obj;
        return u890.j(this.a, d8bVar.a) && this.b == d8bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
