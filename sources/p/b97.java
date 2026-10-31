package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b97 {
    public final List a;
    public final ArrayList b;

    public b97(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b97)) {
            return false;
        }
        b97 b97Var = (b97) obj;
        return this.a.equals(b97Var.a) && this.b.equals(b97Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
