package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qe6 implements se6 {
    public final ArrayList a;
    public final ArrayList b;

    public qe6(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe6)) {
            return false;
        }
        qe6 qe6Var = (qe6) obj;
        return this.a.equals(qe6Var.a) && this.b.equals(qe6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
