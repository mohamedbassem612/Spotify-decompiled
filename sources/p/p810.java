package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p810 {
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;

    public p810(String str, String str2, List list, boolean z) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p810)) {
            return false;
        }
        p810 p810Var = (p810) obj;
        return this.a.equals(p810Var.a) && u890.j(this.b, p810Var.b) && u890.j(this.c, p810Var.c) && this.d == p810Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
