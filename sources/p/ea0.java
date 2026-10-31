package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ea0 extends ga0 {
    public final ArrayList d;
    public final ArrayList e;

    public ea0(ArrayList arrayList, ArrayList arrayList2) {
        super(2131951803, 1, tmx.c);
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea0)) {
            return false;
        }
        ea0 ea0Var = (ea0) obj;
        return this.d.equals(ea0Var.d) && this.e.equals(ea0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
