package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u3f {
    public final ibf a;
    public final List b;

    public u3f(ibf ibfVar, List list) {
        this.a = ibfVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3f)) {
            return false;
        }
        u3f u3fVar = (u3f) obj;
        return u890.j(this.a, u3fVar.a) && this.b.equals(u3fVar.b);
    }

    public final int hashCode() {
        ibf ibfVar = this.a;
        return this.b.hashCode() + ((ibfVar == null ? 0 : ibfVar.hashCode()) * 31);
    }
}
