package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hp21 {
    public final ArrayList a;
    public final int b;
    public final String c;
    public final String d;

    public hp21(int i, String str, String str2, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp21)) {
            return false;
        }
        hp21 hp21Var = (hp21) obj;
        return this.a.equals(hp21Var.a) && this.b == hp21Var.b && u890.j(this.c, hp21Var.c) && u890.j(this.d, hp21Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        int iC = (iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31;
        String str = this.c;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
