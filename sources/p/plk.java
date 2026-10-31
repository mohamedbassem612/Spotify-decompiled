package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class plk extends vlk {
    public final ArrayList a;
    public final qjk b;
    public final String c;

    public plk(ArrayList arrayList, qjk qjkVar, String str) {
        this.a = arrayList;
        this.b = qjkVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof plk) {
            plk plkVar = (plk) obj;
            if (this.a.equals(plkVar.a) && this.b == plkVar.b && this.c.equals(plkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
