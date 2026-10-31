package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dbo {
    public final String a;
    public final int b;
    public final d8r0 c;
    public final String d;
    public final String e;
    public final String f;
    public final ArrayList g;

    public dbo(String str, int i, d8r0 d8r0Var, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = i;
        this.c = d8r0Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbo)) {
            return false;
        }
        dbo dboVar = (dbo) obj;
        return u890.j(this.a, dboVar.a) && this.b == dboVar.b && this.c.equals(dboVar.c) && u890.j(this.d, dboVar.d) && u890.j(this.e, dboVar.e) && u890.j(this.f, dboVar.f) && this.g.equals(dboVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(hrt.i(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
