package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fqt {
    public final ArrayList a;
    public final String b;

    public fqt(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqt)) {
            return false;
        }
        fqt fqtVar = (fqt) obj;
        return this.a.equals(fqtVar.a) && this.b.equals(fqtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
