package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i0l {
    public final String a;
    public final ArrayList b;

    public i0l(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0l)) {
            return false;
        }
        i0l i0lVar = (i0l) obj;
        return u890.j(this.a, i0lVar.a) && this.b.equals(i0lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
