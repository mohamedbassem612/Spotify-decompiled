package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mjf1 {
    public final int a;
    public final ArrayList b;

    public mjf1(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjf1)) {
            return false;
        }
        mjf1 mjf1Var = (mjf1) obj;
        return this.a == mjf1Var.a && this.b.equals(mjf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
