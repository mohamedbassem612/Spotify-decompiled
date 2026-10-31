package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ct3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public ct3(String str, String str2, String str3, String str4, List list) {
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
        if (!(obj instanceof ct3)) {
            return false;
        }
        ct3 ct3Var = (ct3) obj;
        return u890.j(this.a, ct3Var.a) && u890.j(this.b, ct3Var.b) && u890.j(this.c, ct3Var.c) && u890.j(this.d, ct3Var.d) && u890.j(this.e, ct3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
