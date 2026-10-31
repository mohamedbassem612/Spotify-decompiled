package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gva {
    public final ova a;
    public final ArrayList b;

    public gva(ova ovaVar, ArrayList arrayList) {
        this.a = ovaVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gva)) {
            return false;
        }
        gva gvaVar = (gva) obj;
        return this.a == gvaVar.a && this.b.equals(gvaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
