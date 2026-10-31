package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q6a1 {
    public final jo70 a;
    public final ArrayList b;

    public q6a1(jo70 jo70Var, ArrayList arrayList) {
        this.a = jo70Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6a1)) {
            return false;
        }
        q6a1 q6a1Var = (q6a1) obj;
        return this.a.equals(q6a1Var.a) && this.b.equals(q6a1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
