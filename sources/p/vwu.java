package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vwu implements xwu {
    public final ArrayList a;
    public final Throwable b;

    public vwu(ArrayList arrayList, Throwable th) {
        this.a = arrayList;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwu)) {
            return false;
        }
        vwu vwuVar = (vwu) obj;
        return this.a.equals(vwuVar.a) && this.b.equals(vwuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
