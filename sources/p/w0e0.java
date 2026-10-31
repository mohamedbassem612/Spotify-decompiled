package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w0e0 {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;

    public w0e0(boolean z, ArrayList arrayList, ArrayList arrayList2) {
        this.a = z;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0e0)) {
            return false;
        }
        w0e0 w0e0Var = (w0e0) obj;
        return this.a == w0e0Var.a && this.b.equals(w0e0Var.b) && this.c.equals(w0e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
