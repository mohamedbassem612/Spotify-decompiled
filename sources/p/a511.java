package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a511 {
    public final String a;
    public final String b;
    public final Map c;

    public a511(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a511)) {
            return false;
        }
        a511 a511Var = (a511) obj;
        return u890.j(this.a, a511Var.a) && u890.j(this.b, a511Var.b) && u890.j(this.c, a511Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
