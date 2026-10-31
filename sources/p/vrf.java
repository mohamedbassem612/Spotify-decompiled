package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vrf implements wrf {
    public final String a;
    public final w4i1 b;
    public final ArrayList c;

    public vrf(String str, w4i1 w4i1Var, ArrayList arrayList) {
        this.a = str;
        this.b = w4i1Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrf)) {
            return false;
        }
        vrf vrfVar = (vrf) obj;
        return u890.j(this.a, vrfVar.a) && u890.j(this.b, vrfVar.b) && this.c.equals(vrfVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ydh.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
