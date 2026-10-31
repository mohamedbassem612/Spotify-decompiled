package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w900 {
    public final v900 a;
    public final ArrayList b;
    public final boolean c;
    public final String d;
    public final int e;

    public w900(v900 v900Var, ArrayList arrayList, boolean z, String str, int i) {
        this.a = v900Var;
        this.b = arrayList;
        this.c = z;
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w900)) {
            return false;
        }
        w900 w900Var = (w900) obj;
        return this.a.equals(w900Var.a) && this.b.equals(w900Var.b) && this.c == w900Var.c && u890.j(this.d, w900Var.d) && this.e == w900Var.e;
    }

    public final int hashCode() {
        int iG = xcg1.g(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return Integer.hashCode(this.e) + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
