package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sj51 {
    public final String a;
    public final boolean b;
    public final List c;

    public sj51(int i, ArrayList arrayList, boolean z) {
        z = (i & 2) != 0 ? false : z;
        arrayList = (i & 4) != 0 ? z6x.a : arrayList;
        this.a = "";
        this.b = z;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj51)) {
            return false;
        }
        sj51 sj51Var = (sj51) obj;
        return this.a.equals(sj51Var.a) && this.b == sj51Var.b && this.c.equals(sj51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
