package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mjy {
    public final ArrayList a;
    public final oiy b;
    public final boolean c;

    public mjy(ArrayList arrayList, oiy oiyVar, boolean z) {
        this.a = arrayList;
        this.b = oiyVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjy)) {
            return false;
        }
        mjy mjyVar = (mjy) obj;
        return this.a.equals(mjyVar.a) && u890.j(this.b, mjyVar.b) && this.c == mjyVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        oiy oiyVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (oiyVar == null ? 0 : oiyVar.hashCode())) * 31);
    }
}
