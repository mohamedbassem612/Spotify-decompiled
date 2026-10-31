package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z1k0 implements k4k0 {
    public final int a;
    public final ArrayList b;

    public z1k0(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1k0)) {
            return false;
        }
        z1k0 z1k0Var = (z1k0) obj;
        return this.a == z1k0Var.a && this.b.equals(z1k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
