package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lwb0 {
    public final ArrayList a;
    public final xu30 b;
    public final vu30 c;

    public lwb0(ArrayList arrayList, xu30 xu30Var, vu30 vu30Var) {
        this.a = arrayList;
        this.b = xu30Var;
        this.c = vu30Var;
    }

    public final vu30 a() {
        return this.c;
    }

    public final List b() {
        return this.a;
    }

    public final xu30 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwb0)) {
            return false;
        }
        lwb0 lwb0Var = (lwb0) obj;
        return this.a.equals(lwb0Var.a) && u890.j(this.b, lwb0Var.b) && u890.j(this.c, lwb0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xu30 xu30Var = this.b;
        int iHashCode2 = (iHashCode + (xu30Var == null ? 0 : xu30Var.hashCode())) * 31;
        vu30 vu30Var = this.c;
        return iHashCode2 + (vu30Var != null ? vu30Var.hashCode() : 0);
    }
}
