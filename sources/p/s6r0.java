package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s6r0 {
    public final p480 a;
    public final int b;
    public final long c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f;
    public final Integer g;

    public s6r0(p480 p480Var, int i, long j, ArrayList arrayList, ArrayList arrayList2, String str, Integer num) {
        this.a = p480Var;
        this.b = i;
        this.c = j;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = str;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6r0)) {
            return false;
        }
        s6r0 s6r0Var = (s6r0) obj;
        return this.a.equals(s6r0Var.a) && this.b == s6r0Var.b && this.c == s6r0Var.c && this.d.equals(s6r0Var.d) && this.e.equals(s6r0Var.e) && u890.j(this.f, s6r0Var.f) && u890.j(this.g, s6r0Var.g);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.e, p3d1.f(this.d, cy30.f(kaa0.f(this.b, this.a.a.hashCode() * 31, 31), this.c, 31), 31), 31);
        String str = this.f;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
