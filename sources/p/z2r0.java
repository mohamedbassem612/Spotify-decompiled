package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z2r0 {
    public final ArrayList a;
    public final int b;

    public z2r0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2r0)) {
            return false;
        }
        z2r0 z2r0Var = (z2r0) obj;
        return this.a.equals(z2r0Var.a) && this.b == z2r0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
