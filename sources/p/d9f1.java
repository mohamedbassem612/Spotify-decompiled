package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d9f1 {
    public final String a;
    public final ArrayList b;

    public d9f1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9f1)) {
            return false;
        }
        d9f1 d9f1Var = (d9f1) obj;
        return u890.j(this.a, d9f1Var.a) && this.b.equals(d9f1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + cy30.d(-244151317, 31, this.a);
    }
}
