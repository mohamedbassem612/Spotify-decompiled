package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yjd1 {
    public final String a;
    public final boolean b;
    public final List c;
    public final int d;

    public yjd1(int i, int i2, ArrayList arrayList, boolean z) {
        z = (i2 & 2) != 0 ? false : z;
        arrayList = (i2 & 4) != 0 ? z6x.a : arrayList;
        i = (i2 & 8) != 0 ? 0 : i;
        this.a = "";
        this.b = z;
        this.c = arrayList;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjd1)) {
            return false;
        }
        yjd1 yjd1Var = (yjd1) obj;
        return this.a.equals(yjd1Var.a) && this.b == yjd1Var.b && this.c.equals(yjd1Var.c) && this.d == yjd1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f4i1.b(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
