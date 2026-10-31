package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class urf implements wrf {
    public final String a;
    public final jwm b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public urf(String str, jwm jwmVar, List list, boolean z, boolean z2) {
        this.a = str;
        this.b = jwmVar;
        this.c = list;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urf)) {
            return false;
        }
        urf urfVar = (urf) obj;
        return u890.j(this.a, urfVar.a) && u890.j(this.b, urfVar.b) && this.c.equals(urfVar.c) && this.d == urfVar.d && this.e == urfVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.e) + xcg1.g(f4i1.b((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c), 31, this.d);
    }
}
