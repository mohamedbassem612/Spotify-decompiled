package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eqp0 {
    public final ArrayList a;
    public final boolean b;

    public eqp0(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqp0)) {
            return false;
        }
        eqp0 eqp0Var = (eqp0) obj;
        return this.a.equals(eqp0Var.a) && this.b == eqp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
