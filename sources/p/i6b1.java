package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i6b1 {
    public final ArrayList a;
    public final Exception b;
    public final ArrayList c;

    public i6b1(ArrayList arrayList, Exception exc, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = exc;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6b1)) {
            return false;
        }
        i6b1 i6b1Var = (i6b1) obj;
        return this.a.equals(i6b1Var.a) && u890.j(this.b, i6b1Var.b) && this.c.equals(i6b1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Exception exc = this.b;
        return this.c.hashCode() + ((iHashCode + (exc == null ? 0 : exc.hashCode())) * 31);
    }
}
