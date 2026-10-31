package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b4e0 {
    public final String a;
    public final iyr0 b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;

    public b4e0(String str, iyr0 iyr0Var, boolean z, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = iyr0Var;
        this.c = z;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4e0)) {
            return false;
        }
        b4e0 b4e0Var = (b4e0) obj;
        return this.a.equals(b4e0Var.a) && this.b == b4e0Var.b && this.c == b4e0Var.c && this.d.equals(b4e0Var.d) && this.e.equals(b4e0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p3d1.f(this.d, xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
    }
}
