package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yi60 implements zi60 {
    public final int a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public yi60(int i, int i2, int i3, ArrayList arrayList) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi60)) {
            return false;
        }
        yi60 yi60Var = (yi60) obj;
        return this.a == yi60Var.a && this.b == yi60Var.b && this.c == yi60Var.c && this.d.equals(yi60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
