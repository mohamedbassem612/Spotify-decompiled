package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j410 {
    public final boolean a;
    public final boolean b;
    public final ArrayList c;

    public j410(ArrayList arrayList, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j410)) {
            return false;
        }
        j410 j410Var = (j410) obj;
        return this.a == j410Var.a && this.b == j410Var.b && this.c.equals(j410Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
