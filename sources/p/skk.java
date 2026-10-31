package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class skk extends vlk {
    public final ArrayList a;
    public final tv80 b;

    public skk(ArrayList arrayList, tv80 tv80Var) {
        this.a = arrayList;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skk)) {
            return false;
        }
        skk skkVar = (skk) obj;
        return this.a.equals(skkVar.a) && u890.j(this.b, skkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
