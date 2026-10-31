package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nlx0 {
    public final int a;
    public final int b;
    public final List c;

    public nlx0(int i, int i2, int i3, ArrayList arrayList) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        arrayList = (i3 & 32) != 0 ? z6x.a : arrayList;
        this.a = i;
        this.b = i2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlx0)) {
            return false;
        }
        nlx0 nlx0Var = (nlx0) obj;
        return this.a == nlx0Var.a && this.b == nlx0Var.b && this.c.equals(nlx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(0, kaa0.f(0, kaa0.f(0, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }
}
