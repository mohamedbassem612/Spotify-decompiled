package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qde1 implements flb {
    public final String a;
    public final ArrayList b;

    public qde1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qde1)) {
            return false;
        }
        qde1 qde1Var = (qde1) obj;
        return this.a.equals(qde1Var.a) && this.b.equals(qde1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
