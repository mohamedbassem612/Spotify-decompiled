package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vef1 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final fef1 d;
    public final String e;

    public vef1(String str, String str2, ArrayList arrayList, fef1 fef1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = fef1Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vef1)) {
            return false;
        }
        vef1 vef1Var = (vef1) obj;
        return this.a.equals(vef1Var.a) && this.b.equals(vef1Var.b) && this.c.equals(vef1Var.c) && this.d.equals(vef1Var.d) && u890.j(this.e, vef1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
