package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w120 {
    public final c8e1 a;
    public final ArrayList b;

    public w120(c8e1 c8e1Var, ArrayList arrayList) {
        this.a = c8e1Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w120)) {
            return false;
        }
        w120 w120Var = (w120) obj;
        return this.a.equals(w120Var.a) && this.b.equals(w120Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
