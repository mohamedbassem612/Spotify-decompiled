package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dzs0 {
    public final boolean a;
    public final List b;
    public final kzs0 c;
    public final Integer d;

    public /* synthetic */ dzs0() {
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add("");
        }
        this(true, arrayList, kzs0.b, null);
    }

    public static dzs0 a(dzs0 dzs0Var, boolean z, ArrayList arrayList, kzs0 kzs0Var, Integer num, int i) {
        if ((i & 1) != 0) {
            z = dzs0Var.a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = dzs0Var.b;
        }
        if ((i & 4) != 0) {
            kzs0Var = dzs0Var.c;
        }
        if ((i & 8) != 0) {
            num = dzs0Var.d;
        }
        return new dzs0(z, list, kzs0Var, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzs0)) {
            return false;
        }
        dzs0 dzs0Var = (dzs0) obj;
        return this.a == dzs0Var.a && u890.j(this.b, dzs0Var.b) && u890.j(this.c, dzs0Var.c) && u890.j(this.d, dzs0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + f4i1.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public dzs0(boolean z, List list, kzs0 kzs0Var, Integer num) {
        this.a = z;
        this.b = list;
        this.c = kzs0Var;
        this.d = num;
    }
}
