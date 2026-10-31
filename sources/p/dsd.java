package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dsd extends hsd {
    public final String a;
    public final i b;
    public final ArrayList c;

    public dsd(String str, i iVar, ArrayList arrayList) {
        this.a = str;
        this.b = iVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsd)) {
            return false;
        }
        dsd dsdVar = (dsd) obj;
        return u890.j(this.a, dsdVar.a) && this.b.equals(dsdVar.b) && this.c.equals(dsdVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + p3d1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
