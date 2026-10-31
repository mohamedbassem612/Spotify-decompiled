package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u6z {
    public final i1z a;
    public final LinkedHashMap b;

    public u6z(i1z i1zVar, LinkedHashMap linkedHashMap) {
        this.a = i1zVar;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6z)) {
            return false;
        }
        u6z u6zVar = (u6z) obj;
        return this.a.equals(u6zVar.a) && this.b.equals(u6zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
