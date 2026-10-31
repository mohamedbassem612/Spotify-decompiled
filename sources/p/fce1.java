package p;

import android.graphics.Rect;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fce1 {
    public final String a;
    public final ArrayList b;
    public final Rect c;

    public fce1(String str, ArrayList arrayList, Rect rect) {
        this.a = str;
        this.b = arrayList;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fce1)) {
            return false;
        }
        fce1 fce1Var = (fce1) obj;
        return this.a.equals(fce1Var.a) && this.b.equals(fce1Var.b) && this.c.equals(fce1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
