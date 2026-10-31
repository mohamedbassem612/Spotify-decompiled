package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gs91 {
    public final List a;
    public final String b;
    public final String c;

    public gs91(String str, List list, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs91)) {
            return false;
        }
        gs91 gs91Var = (gs91) obj;
        return u890.j(this.a, gs91Var.a) && u890.j(this.b, gs91Var.b) && u890.j(this.c, gs91Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
