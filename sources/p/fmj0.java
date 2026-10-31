package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fmj0 {
    public final String a;
    public final fju b;
    public final String c;
    public final ArrayList d;

    public fmj0(String str, fju fjuVar, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = fjuVar;
        this.c = str2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmj0)) {
            return false;
        }
        fmj0 fmj0Var = (fmj0) obj;
        return u890.j(this.a, fmj0Var.a) && this.b.equals(fmj0Var.b) && u890.j(this.c, fmj0Var.c) && this.d.equals(fmj0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
