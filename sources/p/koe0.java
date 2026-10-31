package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class koe0 extends moe0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public koe0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koe0)) {
            return false;
        }
        koe0 koe0Var = (koe0) obj;
        return u890.j(this.a, koe0Var.a) && u890.j(this.b, koe0Var.b) && u890.j(this.c, koe0Var.c) && u890.j(this.d, koe0Var.d) && this.e.equals(koe0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
