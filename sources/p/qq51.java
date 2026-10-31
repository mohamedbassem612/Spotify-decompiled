package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qq51 {
    public final ArrayList a;
    public final List b;
    public final boolean c;

    public qq51(ArrayList arrayList, List list, boolean z) {
        this.a = arrayList;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq51)) {
            return false;
        }
        qq51 qq51Var = (qq51) obj;
        return this.a.equals(qq51Var.a) && this.b.equals(qq51Var.b) && this.c == qq51Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
