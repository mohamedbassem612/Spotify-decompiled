package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tje1 {
    public final gje1 a;
    public final vqe1 b;
    public final vqe1 c;
    public final ArrayList d;

    public tje1(gje1 gje1Var, vqe1 vqe1Var, vqe1 vqe1Var2, ArrayList arrayList) {
        this.a = gje1Var;
        this.b = vqe1Var;
        this.c = vqe1Var2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tje1)) {
            return false;
        }
        tje1 tje1Var = (tje1) obj;
        return this.a.equals(tje1Var.a) && u890.j(this.b, tje1Var.b) && u890.j(this.c, tje1Var.c) && this.d.equals(tje1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vqe1 vqe1Var = this.b;
        int iHashCode2 = (iHashCode + (vqe1Var == null ? 0 : vqe1Var.hashCode())) * 31;
        vqe1 vqe1Var2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (vqe1Var2 != null ? vqe1Var2.hashCode() : 0)) * 31);
    }
}
