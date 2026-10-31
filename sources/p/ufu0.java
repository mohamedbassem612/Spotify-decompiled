package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ufu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public ufu0(String str, String str2, String str3, String str4, List list) {
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
        if (!(obj instanceof ufu0)) {
            return false;
        }
        ufu0 ufu0Var = (ufu0) obj;
        return this.a.equals(ufu0Var.a) && this.b.equals(ufu0Var.b) && u890.j(this.c, ufu0Var.c) && this.d.equals(ufu0Var.d) && this.e.equals(ufu0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
