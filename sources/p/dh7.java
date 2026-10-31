package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dh7 implements z0i {
    public final ArrayList a;
    public final ArrayList b;
    public final int c;
    public final String d;

    public dh7(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh7)) {
            return false;
        }
        dh7 dh7Var = (dh7) obj;
        return this.a.equals(dh7Var.a) && this.b.equals(dh7Var.b) && this.c == dh7Var.c && this.d.equals(dh7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
