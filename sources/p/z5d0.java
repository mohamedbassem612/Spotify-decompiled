package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z5d0 {
    public final boolean a;
    public final ArrayList b;
    public final boolean c;
    public final String d;

    public z5d0(String str, ArrayList arrayList, boolean z, boolean z2) {
        this.a = z;
        this.b = arrayList;
        this.c = z2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5d0)) {
            return false;
        }
        z5d0 z5d0Var = (z5d0) obj;
        return this.a == z5d0Var.a && this.b.equals(z5d0Var.b) && this.c == z5d0Var.c && this.d.equals(z5d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(p3d1.f(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }
}
