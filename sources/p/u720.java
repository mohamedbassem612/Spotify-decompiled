package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u720 extends yzo1 {
    public final List c;
    public final ArrayList d;

    public u720(ArrayList arrayList, List list) {
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u720)) {
            return false;
        }
        u720 u720Var = (u720) obj;
        return u890.j(this.c, u720Var.c) && this.d.equals(u720Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
