package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sv21 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Set e;

    public sv21(String str, String str2, String str3, String str4, Set set) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv21)) {
            return false;
        }
        sv21 sv21Var = (sv21) obj;
        return u890.j(this.a, sv21Var.a) && u890.j(this.b, sv21Var.b) && u890.j(this.c, sv21Var.c) && u890.j(this.d, sv21Var.d) && u890.j(this.e, sv21Var.e);
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

    public /* synthetic */ sv21(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, w7x.a);
    }
}
