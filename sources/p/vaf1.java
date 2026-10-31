package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vaf1 {
    public final w9f1 a;
    public final ArrayList b;

    public vaf1(w9f1 w9f1Var, ArrayList arrayList) {
        this.a = w9f1Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vaf1) {
            vaf1 vaf1Var = (vaf1) obj;
            if (this.a == vaf1Var.a && this.b.equals(vaf1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
