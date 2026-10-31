package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fms {
    public final ak3 a;
    public final List b;
    public final boolean c;

    public fms(ak3 ak3Var, List list, boolean z) {
        this.a = ak3Var;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fms)) {
            return false;
        }
        fms fmsVar = (fms) obj;
        return this.a == fmsVar.a && u890.j(this.b, fmsVar.b) && this.c == fmsVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
