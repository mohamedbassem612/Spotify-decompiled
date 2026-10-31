package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uer0 implements qfr0, sfr0 {
    public final ArrayList a;
    public final tfr0 b;

    public uer0(ArrayList arrayList, tfr0 tfr0Var) {
        this.a = arrayList;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uer0)) {
            return false;
        }
        uer0 uer0Var = (uer0) obj;
        return this.a.equals(uer0Var.a) && this.b.equals(uer0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
