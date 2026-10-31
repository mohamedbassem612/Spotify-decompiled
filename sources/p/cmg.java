package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cmg {
    public final n5f0 a;
    public final ArrayList b;
    public final long c;

    public cmg(n5f0 n5f0Var, ArrayList arrayList, long j) {
        this.a = n5f0Var;
        this.b = arrayList;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmg)) {
            return false;
        }
        cmg cmgVar = (cmg) obj;
        return this.a.equals(cmgVar.a) && this.b.equals(cmgVar.b) && this.c == cmgVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
