package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rk0 {
    public final int a;
    public final String b;
    public final String c;
    public final List d;
    public final lax e;

    public rk0(int i, String str, String str2, List list, lax laxVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk0)) {
            return false;
        }
        rk0 rk0Var = (rk0) obj;
        return this.a == rk0Var.a && u890.j(this.b, rk0Var.b) && u890.j(this.c, rk0Var.c) && this.d.equals(rk0Var.d) && this.e.equals(rk0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + f4i1.b((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
