package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iaz0 implements whm0 {
    public final int a;
    public final nwc b;
    public final nwc c;
    public final List d;

    public iaz0(int i, nwc nwcVar, nwc nwcVar2, List list) {
        this.a = i;
        this.b = nwcVar;
        this.c = nwcVar2;
        this.d = list;
    }

    public static iaz0 b(iaz0 iaz0Var, int i, lwc lwcVar, kwc kwcVar, List list, int i2) {
        if ((i2 & 1) != 0) {
            i = iaz0Var.a;
        }
        nwc nwcVar = lwcVar;
        if ((i2 & 2) != 0) {
            nwcVar = iaz0Var.b;
        }
        nwc nwcVar2 = kwcVar;
        if ((i2 & 4) != 0) {
            nwcVar2 = iaz0Var.c;
        }
        if ((i2 & 8) != 0) {
            list = iaz0Var.d;
        }
        iaz0Var.getClass();
        return new iaz0(i, nwcVar, nwcVar2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaz0)) {
            return false;
        }
        iaz0 iaz0Var = (iaz0) obj;
        return this.a == iaz0Var.a && u890.j(this.b, iaz0Var.b) && u890.j(this.c, iaz0Var.c) && u890.j(this.d, iaz0Var.d);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        nwc nwcVar = this.b;
        int iHashCode = (iC + (nwcVar == null ? 0 : nwcVar.hashCode())) * 31;
        nwc nwcVar2 = this.c;
        return this.d.hashCode() + ((iHashCode + (nwcVar2 != null ? nwcVar2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ iaz0() {
        this(4, null, null, z6x.a);
    }
}
