package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n4r implements f1r {
    public final ArrayList a;
    public final boolean b;
    public final int c;
    public final iu30 d;
    public final int e;

    public n4r(ArrayList arrayList, boolean z, int i, iu30 iu30Var) {
        this.a = arrayList;
        this.b = z;
        this.c = i;
        this.d = iu30Var;
        this.e = arrayList.hashCode();
    }

    @Override // p.f1r
    public final k1r a(Map map) {
        return acq0.H(this.a, map, this.b).map(new m4r(this, (byte) 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1r) || this.e != obj.hashCode()) {
            return false;
        }
        return this.a.equals(((f1r) obj).getItems());
    }

    @Override // p.f1r
    public final List getItems() {
        return this.a;
    }

    public final int hashCode() {
        return this.e;
    }
}
