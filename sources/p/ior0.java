package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ior0 implements kor0 {
    public final List a;
    public final tnr0 b;
    public final bor0 c;
    public final djc0 d;
    public final eor0 e = new eor0();

    public ior0(List list, tnr0 tnr0Var, bor0 bor0Var, djc0 djc0Var) {
        this.a = list;
        this.b = tnr0Var;
        this.c = bor0Var;
        this.d = djc0Var;
    }

    public static ior0 f(ior0 ior0Var, ArrayList arrayList, cjc0 cjc0Var, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = ior0Var.a;
        }
        tnr0 tnr0Var = ior0Var.b;
        bor0 bor0Var = (i & 4) != 0 ? ior0Var.c : null;
        if ((i & 8) != 0) {
            cjc0Var = ior0Var.d;
        }
        ior0Var.getClass();
        return new ior0(list, tnr0Var, bor0Var, cjc0Var);
    }

    public final hor0 a() {
        return for0.a;
    }

    public final tnr0 b() {
        return this.b;
    }

    public final djc0 c() {
        return this.d;
    }

    public final eor0 d() {
        return this.e;
    }

    public final bor0 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ior0)) {
            return false;
        }
        ior0 ior0Var = (ior0) obj;
        return this.a.equals(ior0Var.a) && this.b.equals(ior0Var.b) && u890.j(this.c, ior0Var.c) && u890.j(this.d, ior0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        bor0 bor0Var = this.c;
        return this.d.hashCode() + ((iHashCode + (bor0Var == null ? 0 : bor0Var.hashCode())) * 31);
    }
}
