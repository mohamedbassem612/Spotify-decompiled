package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cj00 {
    public final ui00 a;
    public final List b;
    public final ti00 c;
    public final pi00 d;
    public final ri00 e;
    public final mi00 f;
    public final String g;
    public final si00 h;

    public cj00(ui00 ui00Var, List list, ti00 ti00Var, pi00 pi00Var, ri00 ri00Var, String str, si00 si00Var, int i) {
        ui00Var = (i & 1) != 0 ? null : ui00Var;
        list = (i & 2) != 0 ? z6x.a : list;
        ti00Var = (i & 8) != 0 ? null : ti00Var;
        pi00Var = (i & 32) != 0 ? null : pi00Var;
        ri00Var = (i & 64) != 0 ? null : ri00Var;
        mi00 mi00Var = new mi00();
        str = (i & 256) != 0 ? null : str;
        si00Var = (i & 512) != 0 ? null : si00Var;
        this.a = ui00Var;
        this.b = list;
        this.c = ti00Var;
        this.d = pi00Var;
        this.e = ri00Var;
        this.f = mi00Var;
        this.g = str;
        this.h = si00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj00)) {
            return false;
        }
        cj00 cj00Var = (cj00) obj;
        return u890.j(this.a, cj00Var.a) && this.b.equals(cj00Var.b) && u890.j(this.c, cj00Var.c) && u890.j(this.d, cj00Var.d) && u890.j(this.e, cj00Var.e) && this.f.equals(cj00Var.f) && u890.j(this.g, cj00Var.g) && u890.j(this.h, cj00Var.h);
    }

    public final int hashCode() {
        ui00 ui00Var = this.a;
        int iB = f4i1.b((ui00Var == null ? 0 : ui00Var.a.hashCode()) * 31, 961, this.b);
        ti00 ti00Var = this.c;
        int iHashCode = (iB + (ti00Var == null ? 0 : ti00Var.hashCode())) * 961;
        pi00 pi00Var = this.d;
        int iHashCode2 = (iHashCode + (pi00Var == null ? 0 : pi00Var.a.hashCode())) * 31;
        ri00 ri00Var = this.e;
        int iHashCode3 = (iHashCode2 + (ri00Var == null ? 0 : ri00Var.a.hashCode())) * 961;
        String str = this.g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        si00 si00Var = this.h;
        return iHashCode4 + (si00Var != null ? si00Var.hashCode() : 0);
    }
}
