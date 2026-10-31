package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hwq0 extends t3k1 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;

    public hwq0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwq0)) {
            return false;
        }
        hwq0 hwq0Var = (hwq0) obj;
        return u890.j(this.b, hwq0Var.b) && u890.j(this.c, hwq0Var.c) && u890.j(this.d, hwq0Var.d) && u890.j(this.e, hwq0Var.e) && this.f.equals(hwq0Var.f);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return this.f.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
