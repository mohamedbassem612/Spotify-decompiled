package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pp90 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final lp90 d;
    public final fp90 e;
    public final op90 f;
    public final np90 g;
    public final np90 h;

    public pp90(String str, String str2, ArrayList arrayList, lp90 lp90Var, fp90 fp90Var, op90 op90Var, np90 np90Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = lp90Var;
        this.e = fp90Var;
        this.f = op90Var;
        this.g = np90Var;
        this.h = np90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp90)) {
            return false;
        }
        pp90 pp90Var = (pp90) obj;
        return u890.j(this.a, pp90Var.a) && gp90.a(this.b, pp90Var.b) && this.c.equals(pp90Var.c) && this.d.equals(pp90Var.d) && u890.j(this.e, pp90Var.e) && u890.j(this.f, pp90Var.f) && this.g.equals(pp90Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p3d1.f(this.c, (gp90.b(this.b) + (this.a.hashCode() * 31)) * 31, 31)) * 31;
        fp90 fp90Var = this.e;
        int iHashCode2 = (iHashCode + (fp90Var == null ? 0 : fp90Var.hashCode())) * 31;
        op90 op90Var = this.f;
        return this.g.hashCode() + ((iHashCode2 + (op90Var != null ? op90Var.hashCode() : 0)) * 31);
    }
}
