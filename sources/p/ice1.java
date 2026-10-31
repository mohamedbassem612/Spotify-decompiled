package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ice1 {
    public final mj80 a;
    public final ArrayList b;

    public ice1(mj80 mj80Var, ArrayList arrayList) {
        this.a = mj80Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ice1) {
            ice1 ice1Var = (ice1) obj;
            if (this.a == ice1Var.a && this.b.equals(ice1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
