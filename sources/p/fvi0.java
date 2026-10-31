package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fvi0 {
    public final ArrayList a;
    public final boolean b;
    public final String c;
    public final String d;

    public fvi0(String str, String str2, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvi0)) {
            return false;
        }
        fvi0 fvi0Var = (fvi0) obj;
        return this.a.equals(fvi0Var.a) && this.b == fvi0Var.b && u890.j(this.c, fvi0Var.c) && u890.j(this.d, fvi0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
