package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ecy {
    public final ArrayList a;
    public final zby b;
    public final boolean c;
    public final idd1 d;
    public final idd1 e;
    public final idd1 f;
    public final idd1 g;

    public ecy(ArrayList arrayList, zby zbyVar, boolean z) {
        this.a = arrayList;
        this.b = zbyVar;
        this.c = z;
        if (arrayList.size() > 4) {
            n57.e("Max 4 actions allowed");
        }
        this.d = new idd1(new dcy(this, (byte) 0));
        this.e = new idd1(new dcy(this, (byte) 2));
        this.f = new idd1(new dcy(this, (byte) 3));
        this.g = new idd1(new dcy(this, (byte) 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecy)) {
            return false;
        }
        ecy ecyVar = (ecy) obj;
        return this.a.equals(ecyVar.a) && u890.j(this.b, ecyVar.b) && this.c == ecyVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zby zbyVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (zbyVar == null ? 0 : zbyVar.hashCode())) * 31);
    }
}
