package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ei51 {
    public final int a;
    public final String b;
    public final List c;
    public final boolean d;
    public final Integer e;
    public final boolean f;

    public ei51(int i, String str, List list, boolean z, Integer num, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = z;
        this.e = num;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei51)) {
            return false;
        }
        ei51 ei51Var = (ei51) obj;
        return this.a == ei51Var.a && u890.j(this.b, ei51Var.b) && this.c.equals(ei51Var.c) && this.d == ei51Var.d && u890.j(this.e, ei51Var.e) && this.f == ei51Var.f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iG = xcg1.g(f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((iG + (num != null ? num.hashCode() : 0)) * 31);
    }
}
