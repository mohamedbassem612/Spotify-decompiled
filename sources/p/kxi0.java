package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kxi0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public kxi0(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxi0)) {
            return false;
        }
        kxi0 kxi0Var = (kxi0) obj;
        return u890.j(this.a, kxi0Var.a) && u890.j(this.b, kxi0Var.b) && u890.j(this.c, kxi0Var.c) && this.d.equals(kxi0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
