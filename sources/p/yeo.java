package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yeo implements ez00 {
    public final xeo a;
    public final xeo b;
    public final ArrayList c;
    public final ArrayList d;

    public yeo(xeo xeoVar, xeo xeoVar2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = xeoVar;
        this.b = xeoVar2;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeo)) {
            return false;
        }
        yeo yeoVar = (yeo) obj;
        return u890.j(this.a, yeoVar.a) && u890.j(this.b, yeoVar.b) && this.c.equals(yeoVar.c) && this.d.equals(yeoVar.d);
    }

    public final int hashCode() {
        xeo xeoVar = this.a;
        int iHashCode = (xeoVar == null ? 0 : xeoVar.hashCode()) * 31;
        xeo xeoVar2 = this.b;
        return this.d.hashCode() + p3d1.f(this.c, (iHashCode + (xeoVar2 != null ? xeoVar2.hashCode() : 0)) * 31, 31);
    }
}
