package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fer0 implements qfr0, sfr0 {
    public final ArrayList a;
    public final tfr0 b;

    public fer0(ArrayList arrayList, tfr0 tfr0Var) {
        this.a = arrayList;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fer0)) {
            return false;
        }
        fer0 fer0Var = (fer0) obj;
        return this.a.equals(fer0Var.a) && this.b.equals(fer0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
