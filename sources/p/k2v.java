package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k2v {
    public final Map a;
    public final Map b;

    public k2v(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2v)) {
            return false;
        }
        k2v k2vVar = (k2v) obj;
        return u890.j(this.a, k2vVar.a) && u890.j(this.b, k2vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k2v() {
        b7x b7xVar = b7x.a;
        this(b7xVar, b7xVar);
    }
}
