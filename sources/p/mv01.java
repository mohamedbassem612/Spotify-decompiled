package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mv01 {
    public final ArrayList a;
    public final int b;
    public final tr80 c;
    public final List d;

    public mv01(ArrayList arrayList, int i, tr80 tr80Var, List list) {
        this.a = arrayList;
        this.b = i;
        this.c = tr80Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv01)) {
            return false;
        }
        mv01 mv01Var = (mv01) obj;
        return this.a.equals(mv01Var.a) && this.b == mv01Var.b && this.c.equals(mv01Var.c) && this.d.equals(mv01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + lf51.e(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
