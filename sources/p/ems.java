package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ems {
    public final ak3 a;
    public final List b;

    public ems(ak3 ak3Var, List list) {
        this.a = ak3Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ems)) {
            return false;
        }
        ems emsVar = (ems) obj;
        return this.a == emsVar.a && u890.j(this.b, emsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
