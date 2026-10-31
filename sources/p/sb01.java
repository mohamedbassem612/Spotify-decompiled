package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sb01 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final xex0 d;
    public final qqe1 e;
    public final glr0 f;
    public final String g;
    public final String h;

    public sb01(String str, String str2, ArrayList arrayList, xex0 xex0Var, qqe1 qqe1Var, glr0 glr0Var, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = xex0Var;
        this.e = qqe1Var;
        this.f = glr0Var;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb01)) {
            return false;
        }
        sb01 sb01Var = (sb01) obj;
        return this.a.equals(sb01Var.a) && u890.j(this.b, sb01Var.b) && this.c.equals(sb01Var.c) && this.d.equals(sb01Var.d) && this.e.equals(sb01Var.e) && this.f.equals(sb01Var.f) && this.g.equals(sb01Var.g) && this.h.equals(sb01Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(0L) + cy30.d(cy30.d((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p3d1.f(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h);
    }
}
