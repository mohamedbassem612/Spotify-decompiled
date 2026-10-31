package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eib1 {
    public final String a;
    public final ArrayList b;
    public final dib1 c;

    public eib1(String str, ArrayList arrayList, dib1 dib1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = dib1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eib1)) {
            return false;
        }
        eib1 eib1Var = (eib1) obj;
        return this.a.equals(eib1Var.a) && this.b.equals(eib1Var.b) && u890.j(this.c, eib1Var.c);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        dib1 dib1Var = this.c;
        return iF + (dib1Var == null ? 0 : dib1Var.hashCode());
    }
}
