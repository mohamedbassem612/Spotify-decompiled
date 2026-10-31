package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j4c1 {
    public final ArrayList a;
    public final i4c1 b;
    public final String c;
    public final String d;

    public j4c1(ArrayList arrayList, i4c1 i4c1Var, String str, String str2) {
        this.a = arrayList;
        this.b = i4c1Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4c1)) {
            return false;
        }
        j4c1 j4c1Var = (j4c1) obj;
        return this.a.equals(j4c1Var.a) && this.b.equals(j4c1Var.b) && u890.j(this.c, j4c1Var.c) && u890.j(this.d, j4c1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
