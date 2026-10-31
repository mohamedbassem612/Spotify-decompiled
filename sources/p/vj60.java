package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vj60 {
    public final ArrayList a;
    public final String b;
    public final boolean c;
    public final Integer d;

    public vj60(ArrayList arrayList, String str, boolean z, Integer num) {
        this.a = arrayList;
        this.b = str;
        this.c = z;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj60)) {
            return false;
        }
        vj60 vj60Var = (vj60) obj;
        return this.a.equals(vj60Var.a) && u890.j(this.b, vj60Var.b) && this.c == vj60Var.c && u890.j(this.d, vj60Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Integer num = this.d;
        return iG + (num != null ? num.hashCode() : 0);
    }
}
