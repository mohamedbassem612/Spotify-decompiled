package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j0y0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public j0y0(String str, String str2, String str3, String str4, List list) {
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
        if (!(obj instanceof j0y0)) {
            return false;
        }
        j0y0 j0y0Var = (j0y0) obj;
        return this.a.equals(j0y0Var.a) && this.b.equals(j0y0Var.b) && this.c.equals(j0y0Var.c) && this.d.equals(j0y0Var.d) && this.e.equals(j0y0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
