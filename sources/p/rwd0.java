package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rwd0 extends swd0 {
    public final zzd0 a;
    public final List b;
    public final boolean c;

    public rwd0(zzd0 zzd0Var, List list, boolean z) {
        this.a = zzd0Var;
        this.b = list;
        this.c = z;
    }

    public static rwd0 a(rwd0 rwd0Var, zzd0 zzd0Var, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            zzd0Var = rwd0Var.a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = rwd0Var.b;
        }
        boolean z = rwd0Var.c;
        rwd0Var.getClass();
        return new rwd0(zzd0Var, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwd0)) {
            return false;
        }
        rwd0 rwd0Var = (rwd0) obj;
        return this.a.equals(rwd0Var.a) && u890.j(this.b, rwd0Var.b) && this.c == rwd0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }
}
