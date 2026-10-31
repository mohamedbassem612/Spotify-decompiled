package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wu60 {
    public final String a;
    public final wea0 b;
    public final Set c;
    public final int d;
    public final String e;

    public wu60(String str, wea0 wea0Var, Set set, int i, String str2) {
        this.a = str;
        this.b = wea0Var;
        this.c = set;
        this.d = i;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu60)) {
            return false;
        }
        wu60 wu60Var = (wu60) obj;
        return u890.j(this.a, wu60Var.a) && this.b.equals(wu60Var.b) && this.c.equals(wu60Var.c) && this.d == wu60Var.d && this.e.equals(wu60Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, gvg.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
    }
}
