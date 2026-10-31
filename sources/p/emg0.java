package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class emg0 {
    public final jo70 a;
    public final k1r b;
    public final z6a1 c;
    public final List d;
    public final xm6 e;

    public emg0(jo70 jo70Var, k1r k1rVar, z6a1 z6a1Var, List list, xm6 xm6Var) {
        this.a = jo70Var;
        this.b = k1rVar;
        this.c = z6a1Var;
        this.d = list;
        this.e = xm6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emg0)) {
            return false;
        }
        emg0 emg0Var = (emg0) obj;
        return u890.j(this.a, emg0Var.a) && this.b.equals(emg0Var.b) && u890.j(this.c, emg0Var.c) && u890.j(this.d, emg0Var.d) && u890.j(this.e, emg0Var.e);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (this.b.hashCode() + ((jo70Var == null ? 0 : jo70Var.hashCode()) * 31)) * 31;
        z6a1 z6a1Var = this.c;
        int iHashCode2 = (iHashCode + (z6a1Var == null ? 0 : z6a1Var.hashCode())) * 31;
        List list = this.d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        xm6 xm6Var = this.e;
        return iHashCode3 + (xm6Var != null ? xm6Var.hashCode() : 0);
    }
}
