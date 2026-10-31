package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jja {
    public final int a;
    public final List b;
    public final List c;
    public final p60 d;

    public jja(ArrayList arrayList, p60 p60Var, int i) {
        int i2 = i & 2;
        ArrayList arrayList2 = z6x.a;
        ArrayList arrayList3 = i2 != 0 ? arrayList2 : arrayList;
        p60 p60Var2 = (i & 8) != 0 ? new p60(null, null, null, null, null, 0.0f, null, null, null, 0, null, null, 4095) : p60Var;
        this.a = 1;
        this.b = arrayList3;
        this.c = arrayList2;
        this.d = p60Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jja)) {
            return false;
        }
        jja jjaVar = (jja) obj;
        return this.a == jjaVar.a && this.b.equals(jjaVar.b) && this.c.equals(jjaVar.c) && this.d.equals(jjaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(f4i1.b(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }
}
