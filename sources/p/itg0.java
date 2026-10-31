package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class itg0 {
    public final af5 a;
    public final ArrayList b;

    public itg0(af5 af5Var, ArrayList arrayList) {
        this.a = af5Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itg0)) {
            return false;
        }
        itg0 itg0Var = (itg0) obj;
        return this.a.equals(itg0Var.a) && this.b.equals(itg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
