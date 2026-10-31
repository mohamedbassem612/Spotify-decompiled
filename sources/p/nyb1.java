package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nyb1 {
    public final List a;
    public final List b;
    public final Throwable c;

    public nyb1(List list, List list2, Throwable th) {
        this.a = list;
        this.b = list2;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyb1)) {
            return false;
        }
        nyb1 nyb1Var = (nyb1) obj;
        return u890.j(this.a, nyb1Var.a) && u890.j(this.b, nyb1Var.b) && u890.j(this.c, nyb1Var.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        Throwable th = this.c;
        return iB + (th == null ? 0 : th.hashCode());
    }
}
