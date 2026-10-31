package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q4e0 extends r4e0 {
    public final ArrayList a;
    public final int b;

    public q4e0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4e0)) {
            return false;
        }
        q4e0 q4e0Var = (q4e0) obj;
        return this.a.equals(q4e0Var.a) && this.b == q4e0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
