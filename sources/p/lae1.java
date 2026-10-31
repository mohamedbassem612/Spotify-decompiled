package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lae1 {
    public final ArrayList a;
    public final int b;
    public final int c;

    public lae1(ArrayList arrayList, int i, int i2) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lae1)) {
            return false;
        }
        lae1 lae1Var = (lae1) obj;
        return this.a.equals(lae1Var.a) && this.b == lae1Var.b && this.c == lae1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
