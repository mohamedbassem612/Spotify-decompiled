package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rtg {
    public final stg a;
    public final ArrayList b;
    public final ltg c;

    public rtg(stg stgVar, ArrayList arrayList, ltg ltgVar) {
        this.a = stgVar;
        this.b = arrayList;
        this.c = ltgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtg)) {
            return false;
        }
        rtg rtgVar = (rtg) obj;
        return u890.j(this.a, rtgVar.a) && this.b.equals(rtgVar.b) && u890.j(this.c, rtgVar.c);
    }

    public final int hashCode() {
        stg stgVar = this.a;
        int iF = p3d1.f(this.b, (stgVar == null ? 0 : stgVar.hashCode()) * 31, 31);
        ltg ltgVar = this.c;
        return iF + (ltgVar != null ? ltgVar.hashCode() : 0);
    }
}
