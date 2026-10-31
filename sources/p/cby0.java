package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cby0 extends hby0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public cby0(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cby0)) {
            return false;
        }
        cby0 cby0Var = (cby0) obj;
        return this.a.equals(cby0Var.a) && u890.j(this.b, cby0Var.b) && this.c.equals(cby0Var.c) && this.d.equals(cby0Var.d);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
