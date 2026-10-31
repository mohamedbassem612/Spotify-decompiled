package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iru0 {
    public final boolean a;
    public final int b;
    public final ArrayList c;

    public iru0(int i, ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iru0)) {
            return false;
        }
        iru0 iru0Var = (iru0) obj;
        return this.a == iru0Var.a && this.b == iru0Var.b && this.c.equals(iru0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
