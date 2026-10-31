package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bky {
    public final List a;
    public final dky b;

    public bky(List list, dky dkyVar) {
        this.a = list;
        this.b = dkyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bky)) {
            return false;
        }
        bky bkyVar = (bky) obj;
        return u890.j(this.a, bkyVar.a) && u890.j(this.b, bkyVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        dky dkyVar = this.b;
        return iHashCode + (dkyVar != null ? dkyVar.hashCode() : 0);
    }
}
