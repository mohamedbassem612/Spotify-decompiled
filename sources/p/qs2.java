package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qs2 {
    public final ArrayList a;
    public final String b;
    public final String c;

    public qs2(String str, String str2, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs2)) {
            return false;
        }
        qs2 qs2Var = (qs2) obj;
        return this.a.equals(qs2Var.a) && u890.j(this.b, qs2Var.b) && u890.j(this.c, qs2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
