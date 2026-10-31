package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qto0 extends omo1 {
    public final ujo0 c;
    public final b561 d;
    public final khh0 e;
    public final String f;
    public final qn50 g;
    public final List h;
    public final String i;
    public final cvy0 j;

    public qto0(ujo0 ujo0Var, b561 b561Var, khh0 khh0Var, String str, qn50 qn50Var, List list, String str2, cvy0 cvy0Var) {
        this.c = ujo0Var;
        this.d = b561Var;
        this.e = khh0Var;
        this.f = str;
        this.g = qn50Var;
        this.h = list;
        this.i = str2;
        this.j = cvy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qto0)) {
            return false;
        }
        qto0 qto0Var = (qto0) obj;
        return this.c.equals(qto0Var.c) && this.d.equals(qto0Var.d) && u890.j(this.e, qto0Var.e) && u890.j(this.f, qto0Var.f) && u890.j(this.g, qto0Var.g) && this.h.equals(qto0Var.h) && u890.j(this.i, qto0Var.i) && this.j.equals(qto0Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        khh0 khh0Var = this.e;
        int iD = cy30.d((iHashCode + (khh0Var == null ? 0 : khh0Var.hashCode())) * 31, 31, this.f);
        qn50 qn50Var = this.g;
        int iB = f4i1.b((iD + (qn50Var == null ? 0 : qn50Var.hashCode())) * 31, 31, this.h);
        String str = this.i;
        return this.j.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final cvy0 o() {
        return this.j;
    }
}
