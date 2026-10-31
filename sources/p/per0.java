package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class per0 implements qfr0 {
    public final List a;
    public final tfr0 b;

    public per0(ArrayList arrayList, tfr0 tfr0Var) {
        this.a = arrayList;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof per0)) {
            return false;
        }
        per0 per0Var = (per0) obj;
        return this.a.equals(per0Var.a) && this.b.equals(per0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
