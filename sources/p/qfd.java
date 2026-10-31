package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qfd {
    public final String a;
    public final boolean b;
    public final int c;
    public final rh7 d;
    public final ArrayList e;

    public qfd(String str, boolean z, int i, rh7 rh7Var, ArrayList arrayList) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = rh7Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfd)) {
            return false;
        }
        qfd qfdVar = (qfd) obj;
        return this.a.equals(qfdVar.a) && this.b == qfdVar.b && this.c == qfdVar.c && u890.j(this.d, qfdVar.d) && this.e.equals(qfdVar.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
        rh7 rh7Var = this.d;
        return this.e.hashCode() + ((iK + (rh7Var == null ? 0 : rh7Var.hashCode())) * 31);
    }
}
