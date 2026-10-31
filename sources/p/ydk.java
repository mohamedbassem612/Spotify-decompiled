package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ydk implements ez00 {
    public final ArrayList a;
    public final h7r b;
    public final h7r c;
    public final ArrayList d;

    public ydk(ArrayList arrayList, h7r h7rVar, h7r h7rVar2, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = h7rVar;
        this.c = h7rVar2;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydk)) {
            return false;
        }
        ydk ydkVar = (ydk) obj;
        return this.a.equals(ydkVar.a) && u890.j(this.b, ydkVar.b) && u890.j(this.c, ydkVar.c) && this.d.equals(ydkVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        h7r h7rVar = this.b;
        int iHashCode2 = (iHashCode + (h7rVar == null ? 0 : h7rVar.hashCode())) * 31;
        h7r h7rVar2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (h7rVar2 != null ? h7rVar2.hashCode() : 0)) * 31);
    }
}
