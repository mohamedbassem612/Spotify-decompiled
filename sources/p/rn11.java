package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rn11 extends tn11 {
    public final String a;
    public final ArrayList b;
    public final String c = "";
    public final String d = "";

    public rn11(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn11)) {
            return false;
        }
        rn11 rn11Var = (rn11) obj;
        return this.a.equals(rn11Var.a) && this.b.equals(rn11Var.b) && this.c.equals(rn11Var.c) && this.d.equals(rn11Var.d);
    }

    public final int hashCode() {
        return Integer.hashCode(2131101519) + cy30.d(cy30.d(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
