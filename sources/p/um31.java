package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class um31 {
    public final ArrayList a;
    public final String b;
    public final List c;
    public final String d;

    public um31(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = str;
        this.c = arrayList2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um31)) {
            return false;
        }
        um31 um31Var = (um31) obj;
        return this.a.equals(um31Var.a) && u890.j(this.b, um31Var.b) && u890.j(this.c, um31Var.c) && u890.j(this.d, um31Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
