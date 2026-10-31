package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x5s0 {
    public final String a;
    public final int b;
    public final List c;
    public final boolean d;

    public x5s0(int i, String str, List list, boolean z) {
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5s0)) {
            return false;
        }
        x5s0 x5s0Var = (x5s0) obj;
        return u890.j(this.a, x5s0Var.a) && this.b == x5s0Var.b && u890.j(this.c, x5s0Var.c) && this.d == x5s0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f4i1.b(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public /* synthetic */ x5s0(int i, int i2, String str, ArrayList arrayList) {
        this(i, str, (i2 & 4) != 0 ? z6x.a : arrayList, false);
    }
}
