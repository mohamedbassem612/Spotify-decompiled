package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r1r0 {
    public final long a;
    public final p480 b;
    public final int c;
    public final long d;
    public final ArrayList e;
    public final ArrayList f;
    public final String g;
    public final Integer h;

    public r1r0(long j, p480 p480Var, int i, long j2, ArrayList arrayList, ArrayList arrayList2, String str, Integer num) {
        this.a = j;
        this.b = p480Var;
        this.c = i;
        this.d = j2;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = str;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1r0)) {
            return false;
        }
        r1r0 r1r0Var = (r1r0) obj;
        return this.a == r1r0Var.a && this.b.equals(r1r0Var.b) && this.c == r1r0Var.c && this.d == r1r0Var.d && this.e.equals(r1r0Var.e) && this.f.equals(r1r0Var.f) && u890.j(this.g, r1r0Var.g) && u890.j(this.h, r1r0Var.h);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.f, p3d1.f(this.e, cy30.f(kaa0.f(this.c, cy30.d(Long.hashCode(this.a) * 31, 31, this.b.a), 31), this.d, 31), 31), 31);
        String str = this.g;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.h;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
