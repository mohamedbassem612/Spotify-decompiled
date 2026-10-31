package p;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dce1 {
    public final ArrayList a;
    public final Set b;
    public final Rect c;

    public dce1(ArrayList arrayList, Set set, Rect rect) {
        this.a = arrayList;
        this.b = set;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dce1)) {
            return false;
        }
        dce1 dce1Var = (dce1) obj;
        return this.a.equals(dce1Var.a) && u890.j(this.b, dce1Var.b) && this.c.equals(dce1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }
}
