package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oxz0 {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public oxz0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxz0)) {
            return false;
        }
        oxz0 oxz0Var = (oxz0) obj;
        return this.a == oxz0Var.a && this.b.equals(oxz0Var.b) && this.c.equals(oxz0Var.c) && this.d.equals(oxz0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, p3d1.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
