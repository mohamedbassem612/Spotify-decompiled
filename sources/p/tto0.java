package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tto0 extends omo1 {
    public final ujo0 c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final cvy0 h;

    public tto0(ujo0 ujo0Var, String str, String str2, String str3, List list, cvy0 cvy0Var) {
        this.c = ujo0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = list;
        this.h = cvy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tto0)) {
            return false;
        }
        tto0 tto0Var = (tto0) obj;
        return this.c.equals(tto0Var.c) && u890.j(this.d, tto0Var.d) && u890.j(this.e, tto0Var.e) && u890.j(this.f, tto0Var.f) && this.g.equals(tto0Var.g) && this.h.equals(tto0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.h.hashCode() + f4i1.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final cvy0 o() {
        return this.h;
    }
}
