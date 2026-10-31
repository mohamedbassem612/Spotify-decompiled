package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rao {
    public final String a;
    public final List b;
    public final d8r0 c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;

    public rao(String str, List list, d8r0 d8r0Var, String str2, int i, String str3, String str4) {
        this.a = str;
        this.b = list;
        this.c = d8r0Var;
        this.d = str2;
        this.e = i;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rao)) {
            return false;
        }
        rao raoVar = (rao) obj;
        return u890.j(this.a, raoVar.a) && u890.j(this.b, raoVar.b) && this.c.equals(raoVar.c) && u890.j(this.d, raoVar.d) && this.e == raoVar.e && u890.j(this.f, raoVar.f) && u890.j(this.g, raoVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iD = cy30.d(kaa0.f(this.e, cy30.d(hrt.i(this.c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.d), 31), 31, this.f);
        String str2 = this.g;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
