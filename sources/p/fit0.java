package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fit0 {
    public final vzq0 a;
    public final String b;
    public final String c;
    public final List d;
    public final pbf0 e;

    public fit0(vzq0 vzq0Var, String str, String str2, List list, pbf0 pbf0Var) {
        this.a = vzq0Var;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = pbf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fit0)) {
            return false;
        }
        fit0 fit0Var = (fit0) obj;
        return this.a.equals(fit0Var.a) && u890.j(this.b, fit0Var.b) && u890.j(this.c, fit0Var.c) && u890.j(this.d, fit0Var.d) && u890.j(this.e, fit0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iB = f4i1.b((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        pbf0 pbf0Var = this.e;
        return iB + (pbf0Var != null ? pbf0Var.hashCode() : 0);
    }
}
