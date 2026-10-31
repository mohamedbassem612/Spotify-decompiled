package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v2t0 implements x2t0 {
    public final ArrayList a;
    public final a3t0 b;
    public final boolean c;
    public final boolean d;

    public v2t0(ArrayList arrayList, a3t0 a3t0Var, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = a3t0Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2t0)) {
            return false;
        }
        v2t0 v2t0Var = (v2t0) obj;
        return this.a.equals(v2t0Var.a) && this.b == v2t0Var.b && this.c == v2t0Var.c && this.d == v2t0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
