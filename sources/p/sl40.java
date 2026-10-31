package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sl40 {
    public final msd a;
    public final chf0 b;
    public final int c;
    public final boolean d;
    public final ArrayList e;

    public sl40(msd msdVar, chf0 chf0Var, int i, boolean z, ArrayList arrayList) {
        this.a = msdVar;
        this.b = chf0Var;
        this.c = i;
        this.d = z;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl40)) {
            return false;
        }
        sl40 sl40Var = (sl40) obj;
        return this.a.equals(sl40Var.a) && this.b == sl40Var.b && this.c == sl40Var.c && this.d == sl40Var.d && this.e.equals(sl40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
    }
}
