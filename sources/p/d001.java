package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d001 implements e001 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public d001(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d001)) {
            return false;
        }
        d001 d001Var = (d001) obj;
        return u890.j(this.a, d001Var.a) && u890.j(this.b, d001Var.b) && u890.j(this.c, d001Var.c) && this.d.equals(d001Var.d) && this.e.equals(d001Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
