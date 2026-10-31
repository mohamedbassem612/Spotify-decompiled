package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wj50 {
    public final ArrayList a;
    public final vu30 b;

    public wj50(ArrayList arrayList, vu30 vu30Var) {
        this.a = arrayList;
        this.b = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj50)) {
            return false;
        }
        wj50 wj50Var = (wj50) obj;
        return this.a.equals(wj50Var.a) && u890.j(this.b, wj50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
