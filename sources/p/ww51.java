package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ww51 {
    public final ArrayList a;
    public final boolean b;

    public ww51(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww51)) {
            return false;
        }
        ww51 ww51Var = (ww51) obj;
        return this.a.equals(ww51Var.a) && this.b == ww51Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
