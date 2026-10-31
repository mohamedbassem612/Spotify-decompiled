package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s4d1 {
    public final ArrayList a;
    public final s7d1 b;

    public s4d1(ArrayList arrayList, s7d1 s7d1Var) {
        this.a = arrayList;
        this.b = s7d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4d1)) {
            return false;
        }
        s4d1 s4d1Var = (s4d1) obj;
        return this.a.equals(s4d1Var.a) && this.b.equals(s4d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
